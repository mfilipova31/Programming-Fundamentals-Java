package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        double fullCourses = Math.ceil(1.0 * people / capacity);
        System.out.printf("%.0f", fullCourses);

    }
}