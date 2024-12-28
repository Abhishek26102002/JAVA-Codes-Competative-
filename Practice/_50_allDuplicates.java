import java.util.*;

public class _50_allDuplicates {
    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                list.add(nums[i]);
            }
        }
        return list;
    }

    public static void main(String[] args) {

        int[] nums = { 8, 7, 6, 5, 5, 3, 2, 1, 1 };
        List<Integer> ans = findDuplicates(nums);
        System.out.println(ans);
    }
}
// Naive method can be improved