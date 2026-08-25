package Searching_Sorting;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWordCount {
    public static void main(String[] args) {
        String filePath = "sample.txt";
        String targetWord = "java";
        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\W+");
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }
            System.out.println("Occurrences of '" + targetWord + "': " + count);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}