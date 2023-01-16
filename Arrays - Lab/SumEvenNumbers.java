package Arrays.Lab;

import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] inputArr = scanner.nextLine().split(" "); // Прочитаме ред и го сплитваме по празно място
        int[] numbersArr = new int[inputArr.length];

        for (int i = 0; i < numbersArr.length; i++) {
            //Превръщаме елементът на текуща позиция от стинговия масив
            //в цяло число и го присвояваме към елемента на числовия масив на текущия индекс
            numbersArr[i] = Integer.parseInt(inputArr[i]);
        }

        int evenSum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            int currentNum = numbersArr[i];
            if (currentNum % 2 == 0){
                evenSum += currentNum;
            }
        }

        System.out.println(evenSum);
        
    }
}