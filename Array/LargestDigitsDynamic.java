package Array;

import java.util.Scanner;

public class LargestDigitsDynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a large number: ");
        long number = Math.abs(scanner.nextLong());

        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        long tempNum = number;
        while (tempNum != 0) {
            if (index == maxDigit) {
                maxDigit += 10;
                int[] tempArray = new int[maxDigit];
                for (int i = 0; i < digits.length; i++) {
                    tempArray[i] = digits[i];
                }
                digits = tempArray;
            }
            digits[index] = (int) (tempNum % 10);
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
            System.out.println("Second largest digit does not exist.");
        }

        scanner.close();
    }
}