public class Name {
    public static String firstName(String fullName) {
        int spacePos = fullName.indexOf(" ");
        return fullName.substring(0, spacePos);
    }

    public static String lastName(String fullName) {
        int spacePos = fullName.indexOf(" ");
        return fullName.substring(spacePos + 1);
    }

    public static String shortName(String fullName) {
        char initial = fullName.charAt(0);
        String surname = lastName(fullName);
        return initial + ". " + surname;
    }

    public static void main(String[] args) {
        String testName = "Joe Bloggs";
        System.out.println("First name: " + Name.firstName(testName));
        System.out.println("Last name: " + Name.lastName(testName));
        System.out.println("Short name: " + Name.shortName(testName));
    }

}

