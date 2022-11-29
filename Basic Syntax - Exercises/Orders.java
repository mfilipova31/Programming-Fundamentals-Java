package BasicSyntaxConditionalsLoops.Exercises;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int orders = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        for (int currentOrder = 1; currentOrder <= orders ; currentOrder++) {
            double pricePerCapsule = Double.parseDouble(scanner.nextLine());
            int days = Integer.parseInt(scanner.nextLine());
            int countCapsules = Integer.parseInt(scanner.nextLine());
            double pricePerCoffee = ((days * countCapsules) * pricePerCapsule);
            totalPrice += pricePerCoffee;
            System.out.printf("The price for the coffee is: $%.2f\n", pricePerCoffee);
        }

        System.out.printf("Total: $%.2f", totalPrice);

    }
}