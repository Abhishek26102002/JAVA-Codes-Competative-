import java.util.*;

public class _32_Quick_Sort {

    public static void swap(int arr[],int bp, int ep) {
        int temp;
        temp = arr[bp];
        arr[bp]=arr[ep];
        arr[ep]=temp;   
    }

    public static int partation(int arr[], int s, int e) {

        int pivot = arr[s];
        int count = 0;
        for (int i = s + 1; i < e; i++) {
            if (arr[i] < pivot) {
                count++;
            }
        }

        int pivotIndex = s + count;

        int bp = s, ep = e;// bp=beining pointer , ep=ending pointer
        while (bp < pivotIndex && ep > pivotIndex) {
            while (arr[bp] < pivot) {
                bp++;
            }
            while (arr[ep] > pivot) {
                ep--;
            }
            if (bp < pivotIndex && ep > pivotIndex) {
                swap(arr, bp,ep);
            }
        }

        return pivotIndex;

    }

    public static void QuickSort(int arr[], int s, int e) {
        if (s > e) {
            return;
        }

        // phele partion krege
        int p = partation(arr, s, e);

        // left solve
        QuickSort(arr, s, p - 1);

        // right solve
        QuickSort(arr, p + 1, e);
    }

    public static void main(String args[]) {
        int arr[] = { 7, 8, 3, 2, 1 };
        int n = arr.length;

        QuickSort(arr, 0, n - 1);

        // Print sorted array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}