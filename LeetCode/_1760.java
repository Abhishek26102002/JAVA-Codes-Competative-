import java.util.*;
// Q. 1760
public class _1760 {

    private static boolean canDivide(int[] nums, int maxOperations, int penalty) {
        int operations = 0;
        for (int balls : nums) {
            if (balls > penalty) {
                operations += (balls - 1) / penalty;
            }
            if (operations > maxOperations)
                return false;
        }
        return true;
    }

    public static int minimumSize(int[] nums, int maxOperations) {
        Arrays.sort(nums);
        int start = 1, end = nums[nums.length - 1];
        int ans = end;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (canDivide(nums, maxOperations, mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        // int[] nums = { 2, 4, 8, 2 };
        int[] nums = { 9 };
        int maxOperations = 2;

        System.out.println(minimumSize(nums, maxOperations));
    }
}
