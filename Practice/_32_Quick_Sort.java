import java.util.*;

public class _32_Quick_Sort {
    private static void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static int rightIndexEle(int[] arr, int s, int e) {
        int swapIndex = s ;
        int RIE = e;

        for (int currIndex = s; currIndex < e; currIndex++) {
            if (arr[currIndex] <= arr[RIE]) {
                swap(arr, currIndex, swapIndex);
                swapIndex++;
            }
        }

        swap(arr, swapIndex , RIE);
        return swapIndex ;
    }

    private static void qS(int[] arr, int s, int e) {
        if (s < e) {

            int RIE = rightIndexEle(arr, s, e); // ele at right index

            qS(arr, s, RIE - 1);
            qS(arr, RIE + 1, e);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 92, 7, 4, 5, 8, 19, 3, 6 };

        qS(arr, 0, arr.length - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}