import java.util.*;

public class _33 {

    static public int search(int[] nums, int target) {

        int i = 0, j = nums.length - 1;

        while (i <= j) { // Use <= to ensure the last element is checked
            int m = i + (j - i) / 2;

            if (nums[m] == target)
                return m;

            // Determine which half is sorted
            if (nums[i] <= nums[m]) { // Left half is sorted
                if (nums[i] <= target && target < nums[m]) {
                    j = m - 1; // Search in left half
                } else {
                    i = m + 1; // Search in right half
                }
            } else { // Right half is sorted
                if (nums[m] < target && target <= nums[j]) {
                    i = m + 1; // Search in right half
                } else {
                    j = m - 1; // Search in left half
                }
            }
        }
        return -1; // Target not found
    }

    public static void main(String args[]) {
        int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
        int target = 0;

        System.out.println(search(nums, target));
    }
}