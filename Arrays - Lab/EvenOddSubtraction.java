package Arrays.Lab;

import java.util.Scanner;

public class EvenOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" ");
        int[] numArr = new int[inputArr.length];

        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(inputArr[i]);
        }

        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numArr.length; i++) {
            int currentNum = numArr[i];
            if (currentNum % 2 == 0){
                evenSum += currentNum;
            } else {
                oddSum += currentNum;
            }
        }

        System.out.println(evenSum - oddSum);

    }
}