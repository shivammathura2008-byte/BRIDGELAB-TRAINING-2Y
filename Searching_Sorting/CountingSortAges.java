package Searching_Sorting;

import java.util.Arrays;

public class CountingSortAges {
    public static void main(String[] args) {
        int[] ages = {15, 12, 18, 14, 15, 10, 11, 18, 16, 14, 12, 10};

        System.out.println("Unsorted Ages: " + Arrays.toString(ages));
        countingSort(ages);
        System.out.println("Sorted Ages: " + Arrays.toString(ages));
    }

    public static void countingSort(int[] arr) {
        if (arr.length == 0) return;

        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
            if (arr[i] < min) min = arr[i];
        }

        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            count[arr[i] - min]++;
        }

        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = output[i];
        }
    }
}