package DataTypesAndVariables.Exercises;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kegCount = Integer.parseInt(scanner.nextLine());

        // максимална стойност на кег
        double maxVolume = Double.MIN_VALUE;
        String nameModelKeg = "";

        for (int i = 1; i <= kegCount; i++) {

            String model = scanner.nextLine();
            double radius = Float.parseFloat(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI * Math.pow(radius, 2) * height;

            // Проверка на максимална стойност
            if (volume > maxVolume){
                maxVolume = volume;
                nameModelKeg = model;
            }

        }

        System.out.println(nameModelKeg);

    }
}
