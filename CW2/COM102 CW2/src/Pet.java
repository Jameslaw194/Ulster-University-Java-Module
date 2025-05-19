class Pet {
    protected String name;
    protected int age;
    protected String colour;
    protected double weight;

    public Pet(String name, int age, String colour, double weight) {
        // Constructor to initialise the Pet object.
        this.name = name;
        this.age = age;
        this.colour = colour;
        this.weight = weight;
    }

    public String speak() {
        // Method to simulate the pet's sound.
        return "I am a pet named " + name;
    }

    public String getName() {
        // Getter for the pet's name.
        return name;
    }

    public String getColour() {/**/
        // Getter for the pet's colour.
        return colour;
    }

    public String toString() {
        // Method to represent the Pet object as a string.
        return name + ", Age: " + age + ", colour: " + colour + ", Weight: " + weight + "kg";
    }
}