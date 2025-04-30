import java.util.*;

public class _15 {
    // brute force // TLE
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>(); // To ensure unique triplets
        int n = nums.length;

        // Iterate through each combination of three numbers
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        // Create a sorted triplet
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);

                        // Add to the set to ensure uniqueness
                        if (!seen.contains(triplet)) {
                            seen.add(triplet);
                            ans.add(triplet);
                        }
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String args[]) {
        int[] nums = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }
}