import java.util.*;

// *Here Pivot is the min ele in the array
public class _59_bottomOfTreng {
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
        int ans = Pivot(arr, n);

        System.out.println("The pivot index is " + ans + " and the ele is " + arr[ans]);

    }
}