import java.util.*;

public class _217 {
    static public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) return true;

            map.put(num, true); // value has no meaning here i just want the key to check
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = { 1, 2, 3, 1 };
        System.out.println(containsDuplicate(nums));
    }
}