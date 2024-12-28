import java.util.*;

public class _31_Rec_bubble_sort {
    public static void B_sort(int[] arr, int size) {
        int t;
        if (size == 0 || size == 1) {
            return;
        }
        for (int i = 0; i < size - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                t = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = t;
            }
        }
        B_sort(arr, size - 1);

    }

    public static void main(String args[]) {
        int arr[] = { 7, 6, 5, 4, 34, 56, 32, 76, 231, 98, 3, 2, 1 };
        int size = arr.length;
        B_sort(arr, size);
        for (int i = 0; i <= size - 1; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}