import java.util.Scanner;

public class ManageAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Account[] accounts = new Account[3];

        for (int i = 0; i < accounts.length; i++) {
            System.out.println("Enter details for Account " + (i + 1));

            System.out.print("Enter name: ");
            String name = scanner.nextLine();

            System.out.print("Enter initial balance: ");
            double balance = scanner.nextDouble();

            System.out.print("Enter account number: ");
            long acctNum = scanner.nextLong();
            scanner.nextLine();

            accounts[i] = new Account(balance, name, acctNum);
        }

        System.out.print("\nEnter an account number to check balance: ");
        long searchAcctNum = scanner.nextLong();

        boolean found = false;
        for (Account acc : accounts) {
            if (acc.getAcctNum() == searchAcctNum) {
                System.out.println("Balance for account " + searchAcctNum + ": $" + acc.getBalance());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Account number not found.");
        }

        scanner.close();
    }
}
