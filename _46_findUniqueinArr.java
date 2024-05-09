import java.util.*;

public class _46_findUniqueinArr {
    public static boolean unique(int[] arr, int size) {
        int i, j;

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (arr[i] == arr[j] && i != j) {
                    break;
                }
            }
            if (j == size) {
                System.out.println("unique ele in arr is " + arr[i]);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 1, 2, 3, 4 };
        int size = arr.length;
        boolean x = unique(arr, size);
        if (!x) {
            System.out.println("Sorry ! No unique ele is present");
        }

    }
}