// Import java libraries.
import java.io.*;
import java.util.*;

class Clinic {
    private List<Pet> pets = new ArrayList<>();
    private String name;
    private String dominantColour = "None";
    private int dogCount = 0;
    private int catCount = 0;

    public Clinic(String name) {
        this.name = name;
        loadFromFile();
        // Load pet data from file on initialisation.
        // This constructor initialises a `Clinic` object with a given name.
        // It also calls the `loadFromFile()` method to attempt to load existing pet data when the clinic is created.
    }

    public void addPet(Pet pet) {
        pets.add(pet);
        // Add a pet to the list.
        // Takes a `Pet` object as input and adds it to the `pets` list, effectively registering a new pet in the clinic.
    }

    public void removePet(String name) {
        boolean removed = pets.removeIf(p -> p.getName().equalsIgnoreCase(name));
        if (!removed) {
            System.out.println("Pet not found.");
            // Removes the pet from the `pets` list based on the provided pet's name, using a lambda expression for concise removal.
            // If the name isn't found, give an appropriate message.
        }
    }

    public void listPets() {/**/
        for (Pet pet : pets) {
            System.out.println(pet);
            // Output details of all pets.
            // Iterates through the `pets` list and prints the details of each pet to the console.
            // It uses the `toString()` method of the `Pet` class (and its subclasses) to provide a formatted output of the pet's information.
        }
    }

    public void searchPet(String search) {
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(search) || pet.getColour().equalsIgnoreCase(search)) {
                System.out.println(pet);
                // Print pet details if name or colour matches the search.
                System.out.println(pet.speak());
                // Output the pet 'speak'.
                return;
            }
        }
        System.out.println("Pet not found.");
        // If no pet found, tell the user.
        // Searches for a pet by name or colour.  It iterates through the `pets` list and checks if the pet's name or colour matches the search query. If a match is found, it prints the pet's details and makes the pet "speak" (using the `speak()` method). If no match is found, it informs the user that the pet was not found.
    }

    public void modifyPet(String name, Scanner scanner) {
        for (Pet pet : pets) {
            if (pet.getName().equalsIgnoreCase(name)) {
                System.out.println("What would you like to modify?");
                System.out.println("1. Name\n2. Age\n3. colour\n4. Weight\n5. Breed");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        // Modify the pet's name.
                        System.out.print("Enter new name: ");
                        pet.name = scanner.nextLine();
                        break;
                    case 2:
                        // Modify the pet's age.
                        System.out.print("Enter new age: ");
                        pet.age = scanner.nextInt();
                        scanner.nextLine();
                        break;
                    case 3:
                        // Modify the pet's colour.
                        System.out.print("Enter new colour: ");
                        pet.colour = scanner.nextLine();
                        break;
                    case 4:
                        // Modify the pet's weight.
                        System.out.print("Enter new weight: ");
                        pet.weight = scanner.nextDouble();
                        scanner.nextLine();
                        break;
                    case 5:
                        if (pet instanceof Dog) {
                            System.out.print("Enter new breed: ");
                            ((Dog) pet).setBreed(scanner.nextLine());
                            // Modify the dog's breed.
                        } else if (pet instanceof Cat) {
                            System.out.print("Enter new breed: ");
                            ((Cat) pet).setBreed(scanner.nextLine());
                            // Modify the cat's breed.
                        } else {
                            System.out.println("Breed cannot be modified for this pet type.");
                        }
                        break;
                    default:
                        // Output message if the user inputs an incorrect option.
                        System.out.println("Invalid choice.");
                }
                // Output confirmation.
                System.out.println("Pet details updated.");
                return;
            }
        }
        // Output to user if the pet cannot be found.
        System.out.println("Pet not found.");
        // Allows modification of a pet's details. It searches for a pet by name, and if found, prompts the user to select which attribute to modify (name, age, colour, weight, or breed). It then takes the new value as input and updates the pet object.  If the pet is a Dog or Cat, it allows modification of the breed. If the pet is not found, it informs the user.
    }

    public void clinicReport() {
        Map<String, Integer> colourCounts = new HashMap<>();
        int maxcolourCount = 0;

        // Loop to count amount of dog's and cat's.
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                dogCount++;
            } else if (pet instanceof Cat) {
                catCount++;
            }

            String colour = pet.getColour().toLowerCase();
            colourCounts.put(colour, colourCounts.getOrDefault(colour, 0) + 1);
            if (colourCounts.get(colour) > maxcolourCount) {
                maxcolourCount = colourCounts.get(colour);
                dominantColour = pet.getColour(); // Determine the dominant colour.
            }
        }

        // Output the clinic report.
        System.out.println("Clinic Report: " + name);
        System.out.println("Total Dogs: " + dogCount);
        System.out.println("Total Cats: " + catCount);
        System.out.println("Dominant colour: " + dominantColour);
        // Generates a report about the clinic. It counts the number of dogs and cats in the clinic and determines the most frequent pet colour.  It then prints a report including the clinic's name, total dogs, total cats, and the dominant colour.
    }

    public void saveToFile() throws IOException {
        BufferedWriter clinicWriter = new BufferedWriter(new FileWriter("src/ClinicDetails.txt"));
        clinicWriter.write("Clinic Name: " + name + "\n");
        clinicWriter.write("Total Dogs: " + dogCount + "\n");
        clinicWriter.write("Total Cats: " + catCount + "\n");
        clinicWriter.write("Dominant colour: " + dominantColour + "\n");
        clinicWriter.close();
        // Save the clinic details to file.

        BufferedWriter petWriter = new BufferedWriter(new FileWriter("src/PetDetails.txt"));
        for (Pet pet : pets) {
            if (pet instanceof Dog) {
                petWriter.write("Dog, " + pet.getName() + ", " + pet.age + ", " + pet.getColour() + ", " + pet.weight + ", " + ((Dog) pet).getBreed() + "\n");
            } else if (pet instanceof Cat) {
                petWriter.write("Cat, " + pet.getName() + ", " + pet.age + ", " + pet.getColour() + ", " + pet.weight + ", " + ((Cat) pet).getBreed() + "\n");
            }
        }
        petWriter.close();
        // Save the pet details to file.
        // Saves the clinic's data (name, dog count, cat count, dominant colour) and the pets' data to separate text files ("ClinicDetails.txt" and "PetDetails.txt").  It uses `BufferedWriter` to efficiently write formatted data to the files.
    }

    public void loadFromFile() {/**/
        // Loads data from the files.
        try (BufferedReader reader = new BufferedReader(new FileReader("src/PetDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(", ");
                if (data.length == 6) {
                    String type = data[0];
                    String name = data[1];
                    int age = Integer.parseInt(data[2]);
                    String colour = data[3];
                    double weight = Double.parseDouble(data[4]);
                    String breed = data[5];
                    if (type.equals("Dog")) {
                        pets.add(new Dog(name, age, colour, weight, breed));
                    } else if (type.equals("Cat")) {
                        pets.add(new Cat(name, age, colour, weight, breed));
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("No previous pet data found.");
            // Handles when no pet data file is found.
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("src/ClinicDetails.txt"))) {
            String line = reader.readLine();
            if (line != null && line.startsWith("Clinic Name: ")) {
                name = line.substring("Clinic Name: ".length());
            }
        } catch (IOException e) {
            name = "Clinic Name";
            // Handles when no clinic data file is found
        }
    }
}