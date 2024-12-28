import java.util.*;

// Using XOR operation it finds {Not always Corect}
public class _49_DuplicateEle {
    public static int RetUni(int[] arr, int size) {
        int ans = 0;
        for (int i = 0; i < size; i++) {
            ans = ans ^ arr[i];
        }
        for (int i = 1; i < size; i++) {
            ans = ans ^ i;
        }
        return ans;

    }

    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 1, 5 };
        int size = arr.length;

        System.out.println("The duplicate ele is " + RetUni(arr, size));

    }
}