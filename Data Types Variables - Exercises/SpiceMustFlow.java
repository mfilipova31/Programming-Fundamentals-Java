package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int yield = Integer.parseInt(scanner.nextLine());
        int dayNumber = 0;
        int spicesAfterWorkersConsumed = 0;
        int totalSpices = 0;

        while (yield >= 100){

            dayNumber++;
            spicesAfterWorkersConsumed = yield - 26;
            totalSpices += spicesAfterWorkersConsumed;
            yield -= 10;

            }

        int spiceExtracted = 0;

        if (totalSpices > 26) {
            spiceExtracted = totalSpices - 26;
        }

        System.out.println(dayNumber);
        System.out.println(spiceExtracted);

    }

}