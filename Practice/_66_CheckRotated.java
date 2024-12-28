import java.util.*;

public class _66_CheckRotated {
    public static boolean check(int[] arr) {
        int count = 0, n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                count++;
            }
        }
        if (arr[n - 1] > arr[0]) {
            count++;
        }
        return count <= 1;
    }

    public static void main(String[] args) {

        int[] arr = { 2,1,3,4};
        System.out.println(check(arr));

    }
}
// source - Leetcode
/*Input: nums = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
Example 2:

Input: nums = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make nums.
Example 3:

Input: nums = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make nums.
  */