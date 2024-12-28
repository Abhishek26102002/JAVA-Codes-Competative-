import java.util.*;
import java.util.Map.Entry;

//find unique ele in array using XOR operation

public class _48_findUniqueEle {

    // only for single unique ele
    public static int findUnique(int[] arr, int size) {
        int ans = 0;
        for (int i = 0; i < size; i++) {
            ans = ans ^ arr[i];
        }
        return ans;
    }

    // for Multi unique ele
    private static ArrayList<Integer> unieles(int[] arr) {
        ArrayList<Integer> a = new ArrayList<>();

        Map<Integer, Integer> m = new HashMap<>();

        for (int x : arr) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }

        for (Entry<Integer, Integer> x : m.entrySet()) {
            if (x.getValue() == 1) {
                a.add(x.getKey());
            }
        }

        return a;
    }

    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 3, 4, 1, 5, 4, 13, 14, 15 };
        int size = arr.length;

        //Single Unique ele

        // int ans = findUnique(arr, size);
        // if (ans != 0) {
        // System.out.println("unique ele is " + ans);
        // } else {
        // System.out.println("No unique ele");
        // }

        // multi unique ele
        for (int x : unieles(arr)) {
            System.out.print(x + " ");
        }
    }
}