import java.util.ArrayList;
import java.util.List;
public class _107_Rec_subsetInteger {

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
        output.remove(output.size() - 1); // remove the added ele *when backtracking

    }

    public static List<List<Integer>> ans(int[] nums) {
        List<Integer> output = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        findSubsets(0, nums, output, ans);
        return ans;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3 };

        System.out.println(ans(nums));

    }
}
