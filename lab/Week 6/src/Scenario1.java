import java.util.*;
import java.util.ArrayList;

public class Scenario1 {
    public static void main(String[] args) {
        ArrayList<String> inputCharacters = new ArrayList<String>();

        Scanner sc = new Scanner(System.in);
        boolean running = true;
        char inputChar = ' ';

        while (running) {
            System.out.print("Enter text (or 'q' to quit): ");
            String input = sc.nextLine().trim().toLowerCase();

            if (input.length() != 1){
                System.out.println("Invalid user input");
                continue;
            }

            if (input.equals("q")) {
                running = false;
                System.out.println(inputCharacters);
                //processNonAlphabeticalWords();
            }
            else {
                System.out.println("You entered: " + input);
                inputCharacters.add(input);
            }
        }
    }

}
