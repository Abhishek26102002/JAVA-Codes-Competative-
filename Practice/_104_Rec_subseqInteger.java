import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class _39_Rec_subseqInteger {

    public static void findSubsets(int index, int[] nums, List<Integer> output, List<List<Integer>> ans) {
        if (index == nums.length) {
            ans.add(new ArrayList<>(output));
            return;
        }

        // exclude
        findSubsets(index + 1, nums, output, ans);

        // include
        output.add(nums[index]);
        findSubsets(index + 1, nums, output, ans);
        output.remove(output.size() - 1);

    }

    public static List<List<Integer>> ans(int[] nums) {
        ArrayList<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(0, nums, output, ans);
        return ans;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3 };

        System.out.println(ans(nums));

    }
}
