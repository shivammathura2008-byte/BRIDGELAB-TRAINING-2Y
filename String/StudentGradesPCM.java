package String;

import java.util.Scanner;

public class StudentGradesPCM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[][] scores = generateScores(numStudents);
        double[][] stats = calculateStats(scores);
        String[][] grades = calculateGrades(stats);

        displayScorecard(scores, stats, grades);

        scanner.close();
    }

    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3];
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = (int) (Math.random() * 90) + 10;
            }
        }
        return scores;
    }

    public static double[][] calculateStats(int[][] scores) {
        double[][] stats = new double[scores.length][3];
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = Math.round((total / 3.0) * 100.0) / 100.0;
            double pct = Math.round((total / 300.0) * 100.0 * 100.0) / 100.0;

            stats[i][0] = total;
            stats[i][1] = avg;
            stats[i][2] = pct;
        }
        return stats;
    }

    public static String[][] calculateGrades(double[][] stats) {
        String[][] grades = new String[stats.length][1];
        for (int i = 0; i < stats.length; i++) {
            double pct = stats[i][2];
            if (pct >= 80) grades[i][0] = "A";
            else if (pct >= 70) grades[i][0] = "B";
            else if (pct >= 60) grades[i][0] = "C";
            else if (pct >= 50) grades[i][0] = "D";
            else grades[i][0] = "F";
        }
        return grades;
    }

    public static void displayScorecard(int[][] scores, double[][] stats, String[][] grades) {
        System.out.println("Std\tPhy\tChem\tMath\tTotal\tAvg\tPct\tGrade");
        System.out.println("---------------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" +
                    scores[i][0] + "\t" +
                    scores[i][1] + "\t" +
                    scores[i][2] + "\t" +
                    stats[i][0] + "\t" +
                    stats[i][1] + "\t" +
                    stats[i][2] + "%\t" +
                    grades[i][0]);
        }
    }
}