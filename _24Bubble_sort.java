import java.util.*;

public class _24Bubble_sort {
    public static void swap(int[] arr, int s, int e) {
        int t = arr[s];
        arr[s] = arr[e];
        arr[e] = t;
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 2, 1 };
        int n = arr.length;

        for (int i = 1; i < n; i++) {// no of rounds
            for (int j = 0; j < n - i; j++) {// checking ans swapping
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]);
        }
    }
}