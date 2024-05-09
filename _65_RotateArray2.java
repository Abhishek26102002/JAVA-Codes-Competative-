import java.util.*;
public class _65_RotateArray2 {

    public static int[] rotate(int[] nums, int k) {
        
        // if (nums == null || nums.length <= 1) {
        //     return nums;
        // }

        int n = nums.length;
        int[] rotated = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = nums[i];
        }

        return rotated;
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // Change this value to rotate by a different amount

        System.out.println("Original Array:");
        printArray(nums);

        int[] rotated = rotate(nums, k);
        System.out.println("Rotated Array:");
        printArray(rotated);
    }
}

// Or 
/*import java.util.Arrays;

public class _65_RotateArray2 {
    public static void solve(int[] arr, int n) {
        int s = 0, e = arr.length - 1;

        //swap
        for (int i = 1; i <= n; i++) {
            int t = arr[s];
            arr[s] = arr[e];
            arr[e] = t;
            s++;
            e--;
        }

        //sort two seperate parts 
        Arrays.sort(arr, 0, n);
        Arrays.sort(arr, n, arr.length);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int noOfrotation = 3;
        solve(arr, noOfrotation);

    }
} */