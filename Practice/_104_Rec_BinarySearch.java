import java.util.Scanner;

public class _23_Rec_BinarySearch {

    public static boolean binarySearch(int[] arr, int s, int e, int key) {
        int mid = s + (e - s) / 2;
        if (s > e) {
            return false;
        }
        if (arr[mid] == key) {
            return true;
        }
        if (arr[mid] < key) {
            return binarySearch(arr, mid + 1, e, key);
        } else {
            return binarySearch(arr, s, mid - 1, key);
        }
    }
    public static void main(String args[]) {
        int[] arr = { 2, 4, 6, 10, 14, 18 };

        int n = arr.length;
        int key = 90;
        System.out.println(binarySearch(arr, 0, n - 1, key));
    }
}