import java.util.*;

public class _55_0_and_1 {

    // put all 1 at the end
    public static void sort(int[] arr, int s) {
        int i = 0, j = s - 1;
        while (i < j) {
            if (arr[i] == 0) {
                i++;
            }

            else {
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
                j--;
            }
        }

        // printing
        System.out.print("[");
        for (int k = 0; k < s - 1; k++) {
            System.out.print(" " + arr[k]);
        }
        System.out.print(" ]");
    }

    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1 };
        int size = arr.length;
        sort(arr, size);

    }
}