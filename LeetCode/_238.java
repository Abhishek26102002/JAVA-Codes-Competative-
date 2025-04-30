import java.util.*;

public class _238 {
    // brute force
    static public int[] productExceptSelff(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        for (int i = 0; i < n; i++) {
            int pro = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                
                pro *= nums[j];
            }
            ans[i] = pro;
        }

        return ans;
    }

    // using divider [NOT preferred as Question]
    public static int[] productExceptSelf(int[] nums) {
        int mul = 1, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count++;
            } else {
                mul *= nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (count > 1) ? 0 : (count == 1) ? ((nums[i] == 0) ? mul : 0) : (mul / nums[i]);
        }
        return nums;
    }

    // using prefix and suffix
    public int[] productExceptSelfff(int[] nums) {
        int n = nums.length;
        int[] left_mul = new int[n];
        int[] right_mul = new int[n];
        int[] ans = new int[n];

        left_mul[0] = 1;
        right_mul[n - 1] = 1;

        for (int i = 1; i < n; i++) {
            left_mul[i] = left_mul[i - 1] * nums[i - 1];
        }

        for (int i = n - 2; i >= 0; i--) {
            right_mul[i] = right_mul[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            ans[i] = left_mul[i] * right_mul[i];
        }
        return ans;
    }

    public static void main(String args[]) {
        // int[] nums = { 1, 2, 3, 4 };
        int[] nums = { -1, 1, 0, -3, 3 };
        // productExceptSelf(nums);
        System.out.println();
        for (int x : productExceptSelff(nums)) {
            System.out.print(x + " ");
        }

    }
}