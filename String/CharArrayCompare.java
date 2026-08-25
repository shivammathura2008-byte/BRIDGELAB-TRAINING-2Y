package String;

import java.util.Scanner;

public class CharArrayCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.next();

        char[] customArray = getChars(text);
        char[] builtInArray = text.toCharArray();

        boolean areEqual = compareCharArrays(customArray, builtInArray);

        System.out.println("Are the character arrays identical? " + areEqual);

        scanner.close();
    }

    public static char[] getChars(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}