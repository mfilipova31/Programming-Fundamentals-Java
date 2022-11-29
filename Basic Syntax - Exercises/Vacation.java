package BasicSyntaxConditionalsLoops.Exercises;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peopleCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String day = scanner.nextLine();
        double price = 0;
        double totalPriceBusiness = 0;
        double discount = 0;

        switch (groupType){
            case "Students":
                switch (day){
                    case "Friday":
                        price = 8.45 * peopleCount;
                        break;
                    case "Saturday":
                        price = 9.80 * peopleCount;
                        break;
                    case "Sunday":
                        price = 10.46 * peopleCount;
                        break;
                }
                if (peopleCount >= 30){
                    discount = price - price * 0.15;
                } else {
                    discount = price;
                }
                System.out.printf("Total price: %.2f", discount);
                break;
            case "Business":
                switch (day){
                    case "Friday":
                        price = 10.9;
                        break;
                    case "Saturday":
                        price = 15.60;
                        break;
                    case "Sunday":
                        price = 16;
                        break;
                }
                totalPriceBusiness = price * peopleCount;

                if (peopleCount >= 100){
                    discount = (peopleCount - 10) * price;
                } else {
                    discount = totalPriceBusiness;
                }
                System.out.printf("Total price: %.2f", discount);
                break;
            case "Regular":
                switch (day){
                    case "Friday":
                        price = 15 * peopleCount;
                        break;
                    case "Saturday":
                        price = 20 * peopleCount;
                        break;
                    case "Sunday":
                        price = 22.5 * peopleCount;
                        break;
                }

                if (peopleCount >= 10 && peopleCount <= 20){
                    discount = price - price * 0.05;
                } else {
                    discount = price;
                }
                System.out.printf("Total price: %.2f", discount);
                break;
        }

    }
}