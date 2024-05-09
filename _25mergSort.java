import java.util.*;

class _25mergSort {
    public static void merge(int[] arr, int s, int e) {
        int mid = s + (e - s) / 2;

        int len1 = mid - s + 1;
        int len2 = e - mid;

        int[] first = new int[len1];
        int[] second = new int[len2];

        // copy two values

        // 1st half part first array ko de dia
        int mainArrayIndex = s;
        for (int i = 0; i < len1; i++) {
            first[i] = arr[mainArrayIndex++];
        }
        // 2nd half ka part 2nd array ko de dia
        mainArrayIndex = mid + 1;
        for (int i = 0; i < len2; i++) {
            second[i] = arr[mainArrayIndex++];
        }

        // merging part//
        // merging two sorted array
        int index1 = 0;
        int index2 = 0;
        mainArrayIndex = s;
        while (index1 < len1 && index2 < len2) {
            if (first[index1] < second[index2]) {
                arr[mainArrayIndex++] = first[index1++];
            } else {
                arr[mainArrayIndex++] = second[index2++];
            }
        }
            while (index1 < len1) {
                arr[mainArrayIndex++] = first[index1++];
            }
            while (index2 < len2) {
                arr[mainArrayIndex++] = second[index2++];
            }

    }

    public static void mergSort(int[] arr, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        // left part ko sort krna
        mergSort(arr, s, mid);

        // right part ko sort krna hai
        mergSort(arr, mid + 1, e);

        // merge
        merge(arr, s, e);

    }

    public static void main(String[] args) {
        int[] arr = { 2, 5, 1, 6, 9, 345, 56, 876, 32, 12, 335, 6, 78 };
        int n = arr.length - 1;

        mergSort(arr, 0, n);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}