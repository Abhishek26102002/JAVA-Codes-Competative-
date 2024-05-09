import java.util.*;
// Acc to Babbar Sir Pivot is the min ele in the array
public class _60_pivot {
    public static int Pivot(int[] arr, int n) {
        int s = 0, e = n - 1, mid = (s + e) / 2;
        while (s < e) {
            if (arr[mid] >= arr[0]) {
                s = mid + 1;

            } else {
                e = mid;
            }
            mid = (s + e) / 2;

        }

        return s;
    }

    public static void main(String[] args) {

        int[] arr = { 7, 9, 1, 2, 3 };
        int n = arr.length;

        System.out.println("The pivot index is " + Pivot(arr, n) + " and the ele is " + arr[Pivot(arr, n)]);

    }
}