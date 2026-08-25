package String;

import java.util.Scanner;

public class FrequencyUsingUnique {
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

    public static char[] getUniqueCharacters(String str) {
        char[] tempArray = new char[str.length()];
        int uniqueCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (currentChar == str.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                tempArray[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = tempArray[i];
        }
        return result;
    }

    public static String[][] getCharacterFrequencies(String str) {
        int[] freq = new int[256];
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }

        char[] uniqueChars = getUniqueCharacters(str);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            result[i][0] = String.valueOf(uniqueChars[i]);
            result[i][1] = String.valueOf(freq[uniqueChars[i]]);
        }
        return result;
    }
}