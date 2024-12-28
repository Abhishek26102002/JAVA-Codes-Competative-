import java.util.*;

class _22_First_LastOcc {

    public static int[] searchRange(int[] nums, int target) {
        int firstOcc = -1;
        int lastOcc = -1;
        int mid = -1;

        int s = 0, e = nums.length - 1;

        // firstOcc ka mid i.e phele kaha mila ele
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target && (m == 0 || nums[m - 1] < target)) {
                mid = m;
                break;
            }
            if (nums[m] < target) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }

        // mid mai 'm' ko store kr lie ab aage bdege

        if (mid != -1) {
            firstOcc = mid;
            while (mid < nums.length && nums[mid] == target) {
                lastOcc = mid;
                mid++;
            }
        }

        return new int[] { firstOcc, lastOcc };
    }

    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 10 };
        int target = 8;

        int[] ans = searchRange(nums, target);
        
        for (int i : ans) {
            System.out.println(i);
        }
    }
}
