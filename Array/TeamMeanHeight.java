package Array;

import java.util.Scanner;

public class TeamMeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;

        System.out.println("Enter the heights of the 11 football players:");
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Player " + (i + 1) + " height: ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }

        double mean = sum / 11;

        System.out.println("\n--- Team Statistics ---");
        System.out.println("The mean height of the football team is: " + mean);

        scanner.close();
    }
}