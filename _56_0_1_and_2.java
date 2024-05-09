import java.util.*;

public class _56_0_1_and_2 {
    // for swapping
    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    // method for sorting
    public static void sort(int[] arr, int s) {
        int low = 0, mid = 0, high = s - 1;

        while (mid < high) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);// swapping arr[mid] <--> arr[low]
                mid++;
                low++;

            }

            if (arr[mid] == 1) {
                mid++;

            }

            else {
                swap(arr, mid, high);// swapping arr[mid] <--> arr[high]
                high--;
            }

        }

        for (int k = 0; k < s; k++) {
            System.out.print(" " + arr[k]);
        }
    }

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 1, 1, 0, 1, 1, 2, 1, 1, 0, 1, 1, 1, 1 };
        int size = arr.length;
        sort(arr, size);

    }
}