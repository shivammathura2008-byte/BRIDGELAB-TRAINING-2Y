package Array;

import java.util.Scanner;

public class StudentGrades1D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int number = scanner.nextInt();

        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] percentages = new double[number];
        String[] grades = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.println("\nStudent " + (i + 1) + " Marks (Out of 100):");
            System.out.print("Physics: ");
            double p = scanner.nextDouble();
            System.out.print("Chemistry: ");
            double c = scanner.nextDouble();
            System.out.print("Maths: ");
            double m = scanner.nextDouble();

            if (p < 0 || c < 0 || m < 0 || p > 100 || c > 100 || m > 100) {
                System.out.println("Invalid marks. Please enter positive values between 0 and 100.");
                i--;
                continue;
            }

            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;

            percentages[i] = (p + c + m) / 3.0;

            if (percentages[i] >= 80) grades[i] = "A";
            else if (percentages[i] >= 70) grades[i] = "B";
            else if (percentages[i] >= 60) grades[i] = "C";
            else if (percentages[i] >= 50) grades[i] = "D";
            else grades[i] = "F";
        }

        System.out.println("\n--- Student Grades Report ---");
        for (int i = 0; i < number; i++) {
            System.out.printf("Student %d -> Phy: %.1f, Chem: %.1f, Math: %.1f | Percentage: %.2f%% | Grade: %s\n",
                    (i + 1), physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }

        scanner.close();
    }
}