package Searching_Sorting;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChallengeStringsAndIO {
    public static void main(String[] args) {
        int iterations = 1000000;
        String text = "hello";

        long startSB = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        System.out.println("StringBuilder Time (ms): " + (System.nanoTime() - startSB) / 1_000_000);

        long startSBuf = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbuf.append(text);
        }
        System.out.println("StringBuffer Time (ms): " + (System.nanoTime() - startSBuf) / 1_000_000);

        String largeFilePath = "largefile.txt";

        long startFR = System.nanoTime();
        int wordCountFR = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(largeFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCountFR += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("File not found for FileReader test.");
        }
        System.out.println("FileReader Time (ms): " + (System.nanoTime() - startFR) / 1_000_000 + " | Words: " + wordCountFR);

        long startISR = System.nanoTime();
        int wordCountISR = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(largeFilePath), "UTF-8"))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCountISR += line.split("\\s+").length;
            }
        } catch (IOException e) {
            System.out.println("File not found for InputStreamReader test.");
        }
        System.out.println("InputStreamReader Time (ms): " + (System.nanoTime() - startISR) / 1_000_000 + " | Words: " + wordCountISR);
    }
}