package String;

import java.util.Scanner;

public class WordLength2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordData = getWordsAndLengths(words);

        System.out.println("Word\t\tLength");
        System.out.println("----------------------");
        for (int i = 0; i < wordData.length; i++) {
            System.out.println(wordData[i][0] + "\t\t" + Integer.parseInt(wordData[i][1]));
        }

        scanner.close();
    }

    public static int getLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitText(String str) {
        int length = getLength(str);
        int spaces = 0;
        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') spaces++;
        }

        String[] words = new String[spaces + 1];
        int wordIndex = 0;
        String temp = "";

        for (int i = 0; i < length; i++) {
            if (str.charAt(i) == ' ') {
                words[wordIndex++] = temp;
                temp = "";
            } else {
                temp += str.charAt(i);
            }
        }
        words[wordIndex] = temp;
        return words;
    }

    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getLength(words[i]));
        }
        return result;
    }
}