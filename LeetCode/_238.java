import java.util.*;

public class _238 {

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
            if (count > 1) {
                nums[i] = 0;
                continue;
            } else {
                if (count == 1) {
                    nums[i] = nums[i] != 0 ? 0 : mul;
                } else {
                    nums[i] = mul / nums[i];
                }
            }
        }
        return nums;
    }

    public static void main(String args[]) {
        // int[] nums = { 1, 2, 3, 4 };
        int[] nums = { -1, 1, 0, -3, 3 };
        productExceptSelf(nums);

    }
}