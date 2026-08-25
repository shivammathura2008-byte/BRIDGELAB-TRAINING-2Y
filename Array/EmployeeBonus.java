package Array;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] newSalary = new double[10];
        double[] bonusAmount = new double[10];

        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;

        System.out.println("Enter details for 10 employees:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Employee " + (i + 1) + " Salary: ");
            double sal = scanner.nextDouble();
            System.out.print("Employee " + (i + 1) + " Years of Service: ");
            double years = scanner.nextDouble();

            if (sal <= 0 || years < 0) {
                System.out.println("Invalid input. Please enter valid positive numbers.");
                i--;
                continue;
            }

            salary[i] = sal;
            yearsOfService[i] = years;
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonusAmount[i] = salary[i] * 0.05;
            } else {
                bonusAmount[i] = salary[i] * 0.02;
            }

            newSalary[i] = salary[i] + bonusAmount[i];

            totalBonus += bonusAmount[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Zara Company Payout Summary ---");
        System.out.println("Total Old Salary Payout: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary Payout: " + totalNewSalary);

        scanner.close();
    }
}