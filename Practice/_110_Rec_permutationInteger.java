import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class _110_Rec_permutationInteger {
    public static void swap(int[] nums, int s, int e) {
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;

    }

    public static void solve(int index, int[] nums, List<List<Integer>> ans) {
        if (index >= nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            ans.add(list);
            return;
        }
        for (int j = index; j < nums.length; j++) {
            swap(nums, j, index);
            solve(index + 1, nums, ans);
            swap(nums, j, index); // backtrack (imp as we want to keep our previous state while going back to avoid errors)

        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int index = 0;
        solve(index, nums, ans);
        return ans;

    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3 };
        System.out.println(permute(nums));

    }
}