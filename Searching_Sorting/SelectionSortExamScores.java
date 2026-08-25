package Searching_Sorting;

import java.util.Arrays;

public class SelectionSortExamScores {
    public static void main(String[] args) {
        int[] scores = {75, 45, 92, 88, 60, 50, 98, 85};

        System.out.println("Unsorted Exam Scores: " + Arrays.toString(scores));
        selectionSort(scores);
        System.out.println("Sorted Exam Scores: " + Arrays.toString(scores));
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
}