import java.util.*;

public class _24_Rec_linearSearch {

    public static boolean linearSearch(int[] arr, int s, int n, int key) {
        if (n == 0) {
            return false;
        }
        if (arr[s] == key) {
            return true;
        }
        return linearSearch(arr, s + 1, n - 1, key);
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        int key = 3;
       System.out.println(linearSearch(arr, 0, n-1, key));
    }
}