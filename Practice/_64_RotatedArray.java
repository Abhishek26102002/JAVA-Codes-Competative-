// 1.Array Should be Sorted

import java.util.Arrays;

public class _64_RotatedArray {
  private static void swap(int[] a, int i, int j) {
    while (i < j) {
      int t = a[i];
      a[i] = a[j];
      a[j] = t;
      i++;
      j--;
    }
  }

  // method 1
  private static void rotate(int[] a, int r) {
    int n = a.length;
    r = r % n; // In case r is greater than the length of the array

    swap(a, 0, n - 1);
    swap(a, 0, r - 1);
    swap(a, r, n - 1);

    for (int x : a) {
      System.out.print(x + " ");
    }
  }

  // Method 2
  public static int[] rotate2(int[] nums, int k) {

    if (nums == null || nums.length <= 1) {
      return nums;
    }

    int n = nums.length;
    int[] rotated = new int[n];

    for (int i = 0; i < n; i++) {
      rotated[(i + k) % n] = nums[i];
    }

    return rotated;
  }

  // mathod 3
  public static void rotate3(int[] arr, int n) {
    int s = 0, e = arr.length - 1;

    // swap
    swap(arr, s, e);

    // sort two seperate parts
    Arrays.sort(arr, 0, n);
    Arrays.sort(arr, n, arr.length);

    for (int x : arr) {
      System.out.print(x + " ");
    }

  }

  public static void main(String args[]) {

    int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    rotate(arr, 3);
  }
}
