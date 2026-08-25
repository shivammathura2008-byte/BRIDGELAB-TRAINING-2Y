package String;

import java.util.Scanner;

public class FirstNonRepeating {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char firstUnique = findFirstNonRepeating(text);

        if (firstUnique != '\0') {
            System.out.println("First non-repeating character: " + firstUnique);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }

    public static char findFirstNonRepeating(String str) {
        int[] freq = new int[256];

        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }
        return '\0';
    }
}