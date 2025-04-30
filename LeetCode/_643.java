import java.util.*;

public class _643 {

    public static double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];  // Remove old element (window shift)
            sum += nums[i];      // Add new element
            maxSum = Math.max(maxSum, sum);
        }

        return (double) maxSum/k;
    }

    

    public static void main(String args[]) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        int k = 4;

        System.out.println(findMaxAverage(nums, k));
    }
}