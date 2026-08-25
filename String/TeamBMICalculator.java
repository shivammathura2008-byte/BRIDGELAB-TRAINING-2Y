package String;

import java.util.Scanner;

public class TeamBMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] personData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        String[][] bmiData = calculateBMIData(personData);
        displayTabular(bmiData);

        scanner.close();
    }

    public static String[] calculateBMIAndStatus(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        double bmi = weight / (heightM * heightM);
        String status = "";

        if (bmi < 18.5) status = "Underweight";
        else if (bmi >= 18.5 && bmi <= 24.9) status = "Normal weight";
        else if (bmi >= 25.0 && bmi <= 29.9) status = "Overweight";
        else status = "Obese";

        return new String[]{String.format("%.2f", bmi), status};
    }

    public static String[][] calculateBMIData(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            result[i][0] = String.valueOf(data[i][1]);
            result[i][1] = String.valueOf(data[i][0]);

            String[] bmiInfo = calculateBMIAndStatus(data[i][0], data[i][1]);
            result[i][2] = bmiInfo[0];
            result[i][3] = bmiInfo[1];
        }
        return result;
    }

    public static void displayTabular(String[][] data) {
        System.out.println("\nHeight(cm)\tWeight(kg)\tBMI\t\tStatus");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1] + "\t\t" + data[i][2] + "\t\t" + data[i][3]);
        }
    }
}