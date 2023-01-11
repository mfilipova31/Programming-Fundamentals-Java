package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        // while loop - стоп като числото <= 0
        // 1.взимаме последната цифра -> % 10
        // 2.сумираме
        // 3.махаме последната цифра -> / 10

        while (number > 0){
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }

        System.out.println(sum);

    }
}