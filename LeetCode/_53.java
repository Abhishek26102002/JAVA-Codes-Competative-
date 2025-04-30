import java.util.*;

public class _53 {
    public static int maxSubArray(int[] nums) {
        int ans = nums[0];
        int max = 0;

        for (int n : nums) {
            if (max < 0) {
                max = 0;
            }

            max += n;
            ans = Math.max(ans, max);
        }

        return ans;        
    }

    public static void main(String args[]) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // [4,-1,2,1]
        System.out.println(maxSubArray(nums));
        
    }
}