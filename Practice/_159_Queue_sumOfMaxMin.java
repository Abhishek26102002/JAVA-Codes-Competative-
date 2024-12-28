import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _159_Queue_sumOfMaxMin {
    // Queue Method
    private static int findSum(int[] arr, int k) {
    //Problem ni samaj aaya to rehne dia
     
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, -1, 7, -3, -1, -2 };
        int k = 4;

        System.out.println(findSum(arr, k));
    }

}

class normalMethod {
    // Complexity Time = O(n^2); space = O(1)
    public static int findSum(int[] arr, int k) {
        int ans = 0;

        List<Integer> sum = new ArrayList<>();

        for (int i = 0; i <= arr.length - k; i++) {
            int min = arr[i];
            int max = arr[i];

            for (int j = i; j < i + k; j++) {
                min = Math.min(min, arr[j]);
                max = Math.max(max, arr[j]);
            }

            sum.add(max + min);
        }

        for (int i = 0; i < sum.size(); i++) {
            ans += sum.get(i);
        }

        return ans;
    }

}