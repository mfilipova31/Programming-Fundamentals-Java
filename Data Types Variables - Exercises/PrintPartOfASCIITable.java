package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class PrintPartOfASCIITable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        String tablePart = "";

        for (int i = start; i <= end; i++) {
            char symbolAtI = (char) i;
            tablePart += symbolAtI + " ";
        }

        System.out.printf("%s", tablePart);

    }
}