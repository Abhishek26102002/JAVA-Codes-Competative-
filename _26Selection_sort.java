import java.util.*;

public class _26Selection_sort {
    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 2, 1 };
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int small=i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[small] > arr[j]) {
                    small = j;
                }

            }
            temp = arr[small];
            arr[small] = arr[ i];
            arr[i] = temp;
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}