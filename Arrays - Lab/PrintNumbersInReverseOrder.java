package Arrays.Lab;

import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbersArr = new int[n];

        for (int i = 0; i < n; i++) {
            int currentNumber = Integer.parseInt(scanner.nextLine());

            numbersArr[i] = currentNumber;
        }

        for (int j = numbersArr.length - 1; j >= 0; j--){
            System.out.printf("%d ", numbersArr[j]);
        }

    }
}