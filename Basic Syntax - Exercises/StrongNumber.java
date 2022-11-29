package BasicSyntaxConditionalsLoops.Exercises;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int startingNum = number;
        int sum = 1;

        int sumFact = 0;
        while (number > 0){
            int lastDigit = number % 10;
            //сумиране на факториел
            for (int i = lastDigit; i >= 1; i--) {
                sum = sum * i;
            }
            sumFact += sum;
            number = number / 10; //премахване на последната цифра
        }

        if (sum == startingNum){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}