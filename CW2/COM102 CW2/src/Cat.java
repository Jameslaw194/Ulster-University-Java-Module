class Cat extends Pet {
    private String breed;

    public Cat(String name, int age, String colour, double weight, String breed) {
        super(name, age, colour, weight);
        // Constructor to initialise the Cat object.
        this.breed = breed;
    }

    public String speak() {
        // Method to simulate the cat's sound.
        return "Meow! I am " + name + ", a " + age + " year old " + breed + " cat.";
    }

    public String toString() {/**/
        // Method to represent the Cat object as a string.
        return super.toString() + ", Breed: " + breed;
    }

    public String getBreed() {
        // Getter for the cat's breed.
        return breed;
    }

    public void setBreed(String breed) {
        // Setter for the cat's breed.
        this.breed = breed;
    }
}