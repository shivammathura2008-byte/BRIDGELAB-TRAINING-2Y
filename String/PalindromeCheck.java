package String;

import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to check for palindrome: ");
        String text = scanner.nextLine();

        boolean logic1 = isPalindromeIterative(text);
        boolean logic2 = isPalindromeRecursive(text, 0, text.length() - 1);
        boolean logic3 = isPalindromeArrayCompare(text);

        System.out.println("Result using Iterative Logic: " + logic1);
        System.out.println("Result using Recursive Logic: " + logic2);
        System.out.println("Result using Array Compare Logic: " + logic3);

        scanner.close();
    }

    public static boolean isPalindromeIterative(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String str, int start, int end) {
        if (start >= end) return true;
        if (str.charAt(start) != str.charAt(end)) return false;
        return isPalindromeRecursive(str, start + 1, end - 1);
    }

    public static boolean isPalindromeArrayCompare(String str) {
        char[] original = str.toCharArray();
        char[] reverse = reverseStringToArray(str);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static char[] reverseStringToArray(String str) {
        char[] reverse = new char[str.length()];
        int index = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse[index++] = str.charAt(i);
        }
        return reverse;
    }
}