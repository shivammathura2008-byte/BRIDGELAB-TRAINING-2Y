package Searching_Sorting;

import java.util.Arrays;

public class BubbleSortMarks {
    public static void main(String[] args) {
        double[] marks = {85.5, 92.0, 78.5, 65.0, 88.5, 95.0, 70.0};

        System.out.println("Unsorted Marks: " + Arrays.toString(marks));
        bubbleSort(marks);
        System.out.println("Sorted Marks: " + Arrays.toString(marks));
    }

    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}