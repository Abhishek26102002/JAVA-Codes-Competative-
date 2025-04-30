import java.util.*;

public class _01 {
    static public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] {}; // return empty in case of we dont get any ans
    }

    // using map function
    // contain key , put , get etc.... ref: Collectionframwork => map
    static public int[] twoSumm(int[] nums, int target) {

        Map<Integer, Integer> numToIndexMap = new HashMap<>();
        int sizeOfArray = nums.length;

        for (int i = 0; i < sizeOfArray; i++) {
            int diff = target - nums[i];
            if (numToIndexMap.containsKey(diff)) {
                return new int[] { i, numToIndexMap.get(diff) };
            }
            numToIndexMap.put(nums[i], i);
        }
        return null;
    }

    public static void main(String args[]) {
        int[] nums = { 2, 7, 11, 15 };
        int target = 9;
        for (int x : twoSumm(nums, target)) {
            System.out.println(x);
        }
    }
}