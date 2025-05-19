class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String colour, double weight, String breed) {
        super(name, age, colour, weight);
        // Constructor to initialise the Dog object.
        this.breed = breed;
    }

    public String speak() {
        // Method to simulate the dog's sound.
        return "Woof! I am " + name + ", a " + age + " year old " + breed + " dog.";
    }

    public String toString() {
        // Method to represent the Dog object as a string.
        return super.toString() + ", Breed: " + breed;
    }

    public String getBreed() {
        // Getter for the dog's breed.
        return breed;
    }

    public void setBreed(String breed) {
        // Setter for the dog's breed.
        this.breed = breed;
    }
}