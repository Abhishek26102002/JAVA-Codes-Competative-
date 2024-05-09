import java.util.*;
import java.util.Arrays;

class _22_First_LastOcc {

    public static int[] searchRange(int[] nums, int target) {
        int first = -1;
        int last = -1;
        int mid = -1; // Initialize mid to -1

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target && (m == 0 || nums[m - 1] < target)) {
                // Found the first occurrence
                mid = m;
                break; // Exit the loop after finding the first occurrence
            }
            if (nums[m] < target) {
                l = m + 1;
            } else {
                r = m - 1;
            }
        }

        if (mid != -1) { // Check if the first occurrence was found
            first = mid;
            while (mid < nums.length && nums[mid] == target) {
                last = mid;
                mid++;
            }

        }

        int[] ans = new int[2];
        ans[0] = first;
        ans[1] = last;
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 10 };
        int target = 6;

        int[] ans = searchRange(nums, target);
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }

    }

}