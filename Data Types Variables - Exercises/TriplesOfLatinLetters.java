package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        // 3 for loops за всяка буква
        for (int first = 0; first < n; first++) {
            char letter1 = (char) ('a' + first);

            for (int second = 0; second < n; second++) {
                char letter2 = (char) ('a' + second);

                for (int third = 0; third < n; third++) {
                    char letter3 = (char) ('a' + third);
                    System.out.printf("%c%c%c\n", letter1, letter2, letter3);
                }

            }

        }
    }

}