public class Scenario2 {
    public static void main(String[] args) {

        int[] numbers = {5, 8, 12, 4, 7};
        String formattedString = arrayToString(numbers);
        System.out.print("Formatted String: " + formattedString);

    }

    static String arrayToString(int[] array) {

        String[] stringArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            stringArray[i] = Integer.toString(array[i]);
        }
        return String.join(" - ", stringArray);
    }
}
