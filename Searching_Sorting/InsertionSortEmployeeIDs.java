package Searching_Sorting;

import java.util.Arrays;

public class InsertionSortEmployeeIDs {
    public static void main(String[] args) {
        int[] employeeIDs = {105, 102, 108, 101, 104, 107, 103};

        System.out.println("Unsorted Employee IDs: " + Arrays.toString(employeeIDs));
        insertionSort(employeeIDs);
        System.out.println("Sorted Employee IDs: " + Arrays.toString(employeeIDs));
    }

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}