package BasicSyntaxConditionalsLoops.Exercises;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= n ; ++i) {
            // i = редове
            for (int j = 1; j <= i ; ++j) {
                //j = колони
                System.out.printf("%d ", i);
            }
            System.out.println();
        }

    }
}