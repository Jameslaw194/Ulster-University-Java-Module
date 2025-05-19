import java.util.Random;
import java.util.Scanner;

public class handling {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        System.out.println(java.util.Arrays.toString(numbers));

        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while(continueProgram) {
            System.out.print("Enter array position (0-9): ");
            int position = scanner.nextInt();

            System.out.print("Enter divisor: ");
            double divisor = scanner.nextDouble();

            if(position >= 0 && position < numbers.length && divisor != 0) {
                double result = numbers[position] / divisor;
                System.out.printf("%.2f%n", result);
            } else {
                System.out.println("Invalid input!");
            }

            System.out.print("Continue? (yes/no): ");
            continueProgram = scanner.next().equalsIgnoreCase("yes");
        }

        scanner.close();
    }
}