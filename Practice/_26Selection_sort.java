import java.util.*;

public class _26Selection_sort {
    public static void Is(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            int small = i;

            for (int j = i + 1; j <= n; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
            // ab swap krna hai small ko phele ele se
            int t = arr[small];
            arr[small] = arr[i];
            arr[i] = t;
        }

    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 2, 1 };
        int n = arr.length - 1;

        Is(arr, n);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}