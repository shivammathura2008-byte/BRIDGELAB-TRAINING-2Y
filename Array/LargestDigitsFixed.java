package Array;

import java.util.Scanner;

public class LargestDigitsFixed {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = Math.abs(scanner.nextInt());

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        int tempNum = number;
        while (tempNum != 0) {
            if (index == maxDigit) {
                break;
            }
            digits[index] = tempNum % 10;
            tempNum /= 10;
            index++;
        }

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        System.out.println("\nFor the number " + number + ":");
        System.out.println("Largest digit: " + largest);
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("Second largest digit does not exist (all digits may be the same).");
        }

        scanner.close();
    }
}