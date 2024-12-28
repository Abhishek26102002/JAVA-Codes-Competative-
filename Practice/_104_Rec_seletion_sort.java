import java.util.*;

public class _33_Rec_seletion_sort {

    public static void S_sort(int[] arr, int s, int e) { //e = arr.lenght-1
        if (s + 1 > e) {
            return;
        }
        for (int j = 0; j <= e; j++) {
            int small = j;
            if (arr[small] > arr[s + 1]) {
                small = s + 1;
            }
            int t = arr[small];
            arr[small] = arr[j];
            arr[j] = t;
        }
        S_sort(arr, s + 1, e);

    }

    public static void main(String args[]) {
        int arr[] = { 7, 6, 3, 2, 8, 1 };
        int n = arr.length - 1;

        S_sort(arr, 0, n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}