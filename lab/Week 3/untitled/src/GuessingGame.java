import java.util.*;
import java.io.*;

public class GuessingGame {
    private Scanner scan;
    int MAX_GUESSES = 6;
    int LOWER_BOUND = 0;
    int UPPER_BOUND = 100;
    char response;
    int secretNumber = 1234;

    private void display(){
        System.out.println(MAX_GUESSES);
        System.out.println(LOWER_BOUND);
        System.out.println(UPPER_BOUND);
    }

    private void start(){

        String input;
        scan = new Scanner(System.in);
        Random random = new Random();

        while (true) {
            System.out.print("Do you want to play a game (y/n)? ");
            input = scan.next().toLowerCase();

            if (!input.equals("y")) {
                System.out.println("Thank you for playing!");
                break;
            }

            secretNumber = random.nextInt(UPPER_BOUND + 1);
            System.out.println("Secret number generated: " + secretNumber);

            boolean won = false;
            int attemptsLeft = MAX_GUESSES;

            while (attemptsLeft > 0 && !won) {
                System.out.printf("Attempts remaining: %d%n", attemptsLeft);
                System.out.print("Enter your guess: ");

                if (!scan.hasNextInt()) {
                    System.out.println("Please enter a valid number!");
                    scan.next();
                    continue;
                }

                int guess = scan.nextInt();

                if (guess < LOWER_BOUND || guess > UPPER_BOUND) {
                    System.out.printf("Please enter a number between %d and %d!%n",
                            LOWER_BOUND, UPPER_BOUND);
                    continue;
                }

                attemptsLeft--;

                if(guess == secretNumber){
                    won = true;
                    System.out.println("Congratulations! You won!");
                }

                else{
                    String hint = guess < secretNumber ? "too low" : "too high";
                    System.out.printf("Your guess is %s!%n", hint);
                }
            }

            if (!won) {
                System.out.printf("Game Over! The secret number was %d.%n", secretNumber);
            }

            System.out.print("\nWould you like to play again? (y/n): ");
            input = scan.next().toLowerCase();

            if (!input.equals("y")) {
                System.out.println("Goodbye!");
                break;
            }
        }

        display();
        scan.close();
    }

    public static void main(String[] args)throws IOException {

        System.out.println("Welcome to the Guessing Game!");
        GuessingGame hiLo = new GuessingGame();
        hiLo.start();
    }
}
