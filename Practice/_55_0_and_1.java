import java.util.*;

public class _55_0_and_1 {

    private static void swap(int[] a, int i, int j) {

        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static void solve(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            if (arr[i] == 0) {
                i++;
            }
            if (arr[j] == 1) {
                j--;
            }
            if (arr[i] == 1 && arr[j] == 0) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };

        solve(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}