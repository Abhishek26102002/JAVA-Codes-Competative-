import java.util.*;

//find unique ele in array using XOR operation

public class _48_findUniqueEle {
    public static int findUnique(int[] arr, int size) {
        int ans = 0;
        for (int i = 0; i < size; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 3, 4, 1, 5 };
        int size = arr.length;

        int ans = findUnique(arr, size);
        if (ans != 0) {
            System.out.println("unique ele is " + ans);
        } else {
            System.out.println("No unique ele");
        }

    }
}