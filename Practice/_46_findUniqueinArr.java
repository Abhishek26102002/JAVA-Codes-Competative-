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
     // Method 2
     public static boolean isUni(int[] arr) {

        Map<Integer, Integer> m = new HashMap<>();

        for (int element : arr) {
            m.put(element, m.getOrDefault(element, 0) + 1);
        }
      //  System.out.println(m); for debug
        for (int count : m.values()) {
            if (count == 1) {
                return true; // Found a unique element
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 1, 2, 3, 4 };
        // int size = arr.length;
        // boolean x = unique(arr, size);
        // if (!x) {
        //     System.out.println("Sorry ! No unique ele is present");
        // }

        System.out.println(isUni(arr));
    }
}