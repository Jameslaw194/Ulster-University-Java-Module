import java.util.Scanner;

public class UseCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Car car1 = new Car("Toyota Corolla", 1600, 2015, 20000, 15000);
        Car car2 = new Car("Honda Civic", 1.8, 2018, 25000, 20000);
        Car car3 = new Car();


        System.out.print("Enter model: ");
        car3.setModel(scanner.nextLine());

        System.out.print("Enter engine size (in cc): ");
        car3.setEngSize(scanner.nextInt());

        System.out.print("Enter year: ");
        car3.setYear(scanner.nextInt());

        System.out.print("Enter new price: ");
        car3.setNewPrice(scanner.nextDouble());

        System.out.print("Enter current value: ");
        double value = scanner.nextDouble();


        scanner.close();


        Car[] cars = {car1, car2, car3};


        for (int i = 0; i < cars.length; i++) {
            System.out.println("\nCar " + (i + 1) + " Details:");
            cars[i].displayDetails();
        }
    }
}