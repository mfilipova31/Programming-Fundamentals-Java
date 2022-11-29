package BasicSyntaxConditionalsLoops.Exercises;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double total = 0;

        //while loop за парите, които са вкарани до команда Стоп
        while (!input.equals("Start")){
            double money = Double.parseDouble(input);
            if (money == 0.1 || money == 0.2 || money == 0.5 || money == 1 || money == 2){
                total += money;
            } else {
                System.out.printf("Cannot accept %.2f\n", money);
            }
            input = scanner.nextLine();
        }

        String purchase = scanner.nextLine();
        double price = 0;

        //while loop за продукт до команда "End"
        while (!purchase.equals("End")){

            switch (purchase){
                case "Nuts":
                    price = 2;
                    break;
                case "Water":
                    price = 0.7;
                    break;
                case "Crisps":
                    price = 1.5;
                    break;
                case "Soda":
                    price = 0.8;
                    break;
                case "Coke":
                    price = 1;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }

            if (total < price){
                System.out.println("Sorry, not enough money");
            } else {
                if (purchase.equals("Nuts") || purchase.equals("Water") || purchase.equals("Crisps")
                        || purchase.equals("Soda") || purchase.equals("Coke")){
                    System.out.printf("Purchased %s\n", purchase);
                    total -= price;
                }
            }

            purchase = scanner.nextLine();
        }

        System.out.printf("Change: %.2f", total);


    }
}