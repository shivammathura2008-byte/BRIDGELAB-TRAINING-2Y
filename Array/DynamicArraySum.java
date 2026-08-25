package Array;

import java.util.Scanner;

public class DynamicArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        System.out.println("Enter up to 10 positive numbers (Enter 0 or a negative number to stop):");

        while (true) {
            if (index == 10) {
                System.out.println("Maximum capacity of 10 reached.");
                break;
            }

            System.out.print("Enter number " + (index + 1) + ": ");
            double input = scanner.nextDouble();

            if (input <= 0) {
                break;
            }

            numbers[index] = input;
            index++;
        }

        System.out.println("\n--- Results ---");
        System.out.print("Numbers entered: ");

        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
            total += numbers[i];
        }

        System.out.println("\nTotal Sum: " + total);
        scanner.close();
    }
}