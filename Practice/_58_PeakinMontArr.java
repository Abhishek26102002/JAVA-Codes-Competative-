import java.util.*;

public class _58_PeakinMontArr {
    public static int PeakinMuntain(int[] arr, int n) {
        int s = 0, e = n - 1;
        while (s < e) {
            int mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                s = mid + 1;
            } else {
                e = mid;
            }
            // mid = s + (e - s) / 2;

        }

        return s;
    }

    public static void main(String[] args) {

        int[] arr = { 0, 1, 2, 3, 4, 65, 67, 78, 89, 13, 11, 10 };
        int n = arr.length;

        System.out.println("Peak at index " + arr[PeakinMuntain(arr, n)]);
    }
}