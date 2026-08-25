package Searching_Sorting;

public class SearchChallenge {
    public static void main(String[] args) {
        int[] unsortedArr = {3, 4, -1, 1};
        System.out.println("First missing positive: " + findFirstMissingPositive(unsortedArr));

        int[] sortedArr = {1, 3, 5, 7, 9, 11};
        int target = 7;
        System.out.println("Index of " + target + " using binary search: " + binarySearch(sortedArr, target));
    }

    public static int findFirstMissingPositive(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                int temp = nums[nums[i] - 1];
                nums[nums[i] - 1] = nums[i];
                nums[i] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}