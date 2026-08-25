package String;

import java.util.Scanner;

public class FrequencyNestedLoops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[] frequencies = getFrequenciesNested(text);

        System.out.println("Character Frequencies:");
        for (int i = 0; i < frequencies.length; i++) {
            System.out.println(frequencies[i]);
        }

        scanner.close();
    }

    public static String[] getFrequenciesNested(String str) {
        char[] chars = str.toCharArray();
        int[] freq = new int[str.length()];

        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j] && chars[i] != '0') {
                    freq[i]++;
                    chars[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0' && chars[i] != ' ') {
                count++;
            }
        }

        String[] result = new String[count];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0' && chars[i] != ' ') {
                result[index] = "'" + chars[i] + "' : " + freq[i];
                index++;
            }
        }
        return result;
    }
}