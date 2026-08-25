package String;

import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequencies = getCharacterFrequencies(text);

        System.out.println("Character\tFrequency");
        System.out.println("-------------------------");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println("   " + frequencies[i][0] + "\t\t   " + frequencies[i][1]);
        }

        scanner.close();
    }

    public static String[][] getCharacterFrequencies(String str) {
        int[] freq = new int[256];
        int uniqueCount = 0;

        for (int i = 0; i < str.length(); i++) {
            if (freq[str.charAt(i)] == 0) {
                uniqueCount++;
            }
            freq[str.charAt(i)]++;
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        boolean[] processed = new boolean[256];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!processed[c]) {
                result[index][0] = String.valueOf(c);
                result[index][1] = String.valueOf(freq[c]);
                processed[c] = true;
                index++;
            }
        }
        return result;
    }
}