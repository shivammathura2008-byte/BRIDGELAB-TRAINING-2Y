package Array;

import java.util.Scanner;

public class BMICalculator1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        double[] weight = new double[number];
        double[] height = new double[number];
        double[] bmi = new double[number];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nPerson " + (i + 1) + ":");
            System.out.print("Weight (in kg): ");
            weight[i] = scanner.nextDouble();
            System.out.print("Height (in meters): ");
            height[i] = scanner.nextDouble();

            if (weight[i] <= 0 || height[i] <= 0) {
                System.out.println("Invalid input. Please enter positive values.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);

            if (bmi[i] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (bmi[i] >= 18.5 && bmi[i] <= 24.9) {
                weightStatus[i] = "Normal weight";
            } else if (bmi[i] >= 25.0 && bmi[i] <= 29.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        System.out.println("\n--- BMI Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d -> Height: %.2fm, Weight: %.2fkg, BMI: %.2f, Status: %s\n",
                    (i + 1), height[i], weight[i], bmi[i], weightStatus[i]);
        }

        scanner.close();
    }
}