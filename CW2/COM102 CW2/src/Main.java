// Import java libraries.
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        // Create a Clinic object and a Scanner object.
        Clinic clinic = new Clinic("Pet Clinic");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display menu options to the user.
            System.out.println("1. Add Pet\n2. Modify Pet\n3. Remove Pet\n4. List Pets\n5. Search Pet\n6. Clinic Report\n7. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Code to add a new pet.
                    String type;
                    while (true) {
                        System.out.print("Enter pet type (dog/cat): ");
                        type = scanner.nextLine();
                        if (type.equalsIgnoreCase("dog") || type.equalsIgnoreCase("cat")) {
                            break; // Exit the loop if input is valid
                        } else {
                            System.out.println("Invalid pet type. Please enter 'dog' or 'cat'.");
                        }
                    }

                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Age: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Colour: ");
                    String colour = scanner.nextLine();
                    System.out.print("Weight: ");
                    double weight = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.print("Breed: ");
                    String breed = scanner.nextLine();

                    if (type.equalsIgnoreCase("dog"))
                        clinic.addPet(new Dog(name, age, colour, weight, breed));
                    else if (type.equalsIgnoreCase("cat"))
                        clinic.addPet(new Cat(name, age, colour, weight, breed));
                    break;

                case 2:
                    // Code to modify an existing pet's details.
                    System.out.print("Enter pet name to modify: ");
                    String modifyName = scanner.nextLine();
                    clinic.modifyPet(modifyName, scanner);
                    break;

                case 3:
                    // Code to remove a pet from the clinic.
                    System.out.print("Enter pet name to remove: ");
                    String removeName = scanner.nextLine();
                    clinic.removePet(removeName);
                    break;

                case 4:
                    // Code to list all pets in the clinic.
                    clinic.listPets();
                    break;

                case 5:
                    // Code to search for a pet by name or colour.
                    System.out.print("Enter pet name or colour to search: ");
                    String search = scanner.nextLine();
                    clinic.searchPet(search);
                    break;

                case 6:
                    // Generate and display a clinic report.
                    clinic.clinicReport();
                    break;

                case 7:
                    // Save data to a file and exit the application.
                    clinic.saveToFile();
                    System.exit(0);/**/

                default:
                    // Handle invalid user input.
                    System.out.println("Invalid choice.");
            }
        }
    }
}