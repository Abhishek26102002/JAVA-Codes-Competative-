import java.util.*;
// Basically a Binary Search
public class _61_eleinPivotedArr {
    public static int Binary(int[] arr, int s, int e, int key) {
        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                // left mia jao

                e = mid - 1;
            }
            if (key > arr[mid]) {
                // right mai jao
                s = mid + 1;
            }
            mid = s + (e - s) / 2;
        }

        return -1;
    }

    public static int getPivot(int[] arr, int n) {
        int s = 0, e = n, mid = (s + e) / 2;
        while (s < e) {
            if (arr[mid] >= arr[0]) {
                s = mid + 1;

            } else {
                e = mid;
            }
            mid = (s + e) / 2;

        }

        return s;
    }

    public static int findPivot(int[] arr, int s, int e, int key) {

        int pivot = getPivot(arr, e);

        if (key >= arr[pivot] && key <= arr[e - 1]) {
            // binary search on 2nd line
            return Binary(arr, pivot, e - 1, key);
        } else {
            // binary search on 1st line
            return Binary(arr, 0, pivot - 1, key);

        }
    }

    public static void main(String[] args) {
        int[] arr = { 7, 9, 1, 2, 3 };
        int ans = findPivot(arr, 0, arr.length - 1, 9);
        if (ans == -1) {
            System.out.println("Not present");
        } else {

            System.out.println("present at index " + ans + " The ele u searched for is " + arr[ans]);
        }
    }
}