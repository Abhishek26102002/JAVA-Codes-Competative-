import java.util.*;

public class _56_0_1_and_2 {
    // for swapping
    public static void swap(int[] arr, int a, int b) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    // method for sorting
    public static void sort(int[] arr, int s) {
        int i = 0, mid = 0, j = s - 1;

        while (mid < j) {
            if (arr[mid] == 0) {
                swap(arr, mid, i);// swapping arr[mid] <--> arr[i]
                mid++;
                i++;

            }

            if (arr[mid] == 1) {
                mid++;
            }

            else {
                swap(arr, mid, j);// swapping arr[mid] <--> arr[j]
                j--;
            }
        }
       
    }
    public static void main(String[] args) {

        int[] arr = { 0, 1, 0, 1, 1, 0, 1, 1, 2, 1, 1, 0, 1, 1, 1, 1 };
        int size = arr.length;
        sort(arr, size);

        for(int x:arr){
            System.out.print(x+" ");
        }

    }
}