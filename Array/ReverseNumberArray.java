package Array;

import java.util.Scanner;

public class ReverseNumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = Math.abs(scanner.nextInt());

        int temp = number;
        int count = 0;
        if (temp == 0) count = 1;
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int[] digits = new int[count];
        temp = number;
        for (int i = 0; i < count; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] reversed = new int[count];
        for (int i = 0; i < count; i++) {
            reversed[i] = digits[i];
        }

        System.out.print("Reversed number array representation: ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i]);
        }
        System.out.println();

        scanner.close();
    }
}