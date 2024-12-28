import java.util.*;

public class _24Bubble_sort {
    public static void swap(int[] arr, int s, int e) {
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }

    public static void bbs(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 2, 1 };
        int n = arr.length - 1;

        bbs(arr, n);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}