import java.util.Scanner;

public class stringCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter in a sentence: ");
        String input = scanner.nextLine().toLowerCase();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (isVowel(ch)) vowels++;
            else if (isConsonant(ch)) consonants++;
            else if (isDigit(ch)) digits++;
        }

        System.out.printf("%d vowels, %d consonants and %d digits%n", vowels, consonants, digits);
        scanner.close();
    }

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';

    }

    public static boolean isConsonant(char ch) {
        return (ch >= 'a' && ch <= 'z');
    }

    public static boolean isDigit(char ch) {
        return (ch >= '0' && ch <= '9');
    }

}
