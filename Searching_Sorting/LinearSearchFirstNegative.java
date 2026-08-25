package Searching_Sorting;

public class LinearSearchFirstNegative {
    public static void main(String[] args) {
        int[] arr = {4, 2, 8, -5, 3, -1};
        System.out.println("First negative index: " + findFirstNegative(arr));
    }

    public static int findFirstNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i;
            }
        }
        return -1;
    }
}