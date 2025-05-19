public class name {
    public static void main(String[] args) {
        String name = "Sebastion";
        char ch1 = name.charAt(0);
        int lastLetterIndex = name.length() - 1;
        char ch2 = name.charAt(lastLetterIndex);

        System.out.println("The first letter of " + name + " is " + ch1);
        System.out.println("The last letter of " + name + " is " + ch2);

        String sentence = "This is a sentence with "+ name + " in it";

        System.out.println("The word " + name + " starts at index " + sentence.indexOf(name));
    }
}
