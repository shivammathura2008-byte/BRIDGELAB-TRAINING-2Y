package String;

import java.util.Scanner;

public class CustomTrim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string with leading/trailing spaces: ");
        String text = scanner.nextLine();

        int[] trimIndices = getTrimIndices(text);
        String customTrim = createSubstring(text, trimIndices[0], trimIndices[1]);
        String builtInTrim = text.trim();

        System.out.println("Custom Trimmed: '" + customTrim + "'");
        System.out.println("Built-in Trimmed: '" + builtInTrim + "'");

        boolean areEqual = compareStrings(customTrim, builtInTrim);
        System.out.println("Are results identical? " + areEqual);

        scanner.close();
    }

    public static int[] getTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }

    public static String createSubstring(String str, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
}