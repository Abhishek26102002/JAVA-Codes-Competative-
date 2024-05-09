import java.util.*;

public class _64_RotatedArray {

  public static void swap(int[] arr, int s, int e) {
    int t = arr[s];
    arr[s] = arr[e];
    arr[e] = t;
  }

  public static void rev(int[] arr) {
    int s = 0, e = arr.length - 1;
    while (s < e) {
      swap(arr, s, e);
      s++;
      e--;
    }
  }

  public static void sort(int[] arr, int s, int e) {
    for (int i = s; i <= e; i++) {
      for (int j = s; j < e; j++) {
        if (arr[j] > arr[j + 1])
          swap(arr, j, j + 1);
      }
    }
  }

  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9 };
    int n = 2, s = 0, e = arr.length - 1;

    rev(arr);
    for (int i = 0; i <= e; i++) {
      System.out.print(arr[i] + " ");
    }
    System.out.println();

    sort(arr, s, n);
    sort(arr, n + 1, e);

    for (int i = 0; i <= e; i++) {
      System.out.print(arr[i] + " ");
    }
  }
}
