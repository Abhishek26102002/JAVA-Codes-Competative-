import java.util.*;

public class _200_Hashing_maxFreq {
    public static void MajorityEle(int[] arr) {
        int n = arr.length;

        HashMap<Integer, Integer> hm = new HashMap<>();
        // .......// Key , Value

        for (int i = 0; i < n; i++) {
            if (hm.containsKey(arr[i])) {// key already exist
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }

        for (int key : hm.keySet()) {
            if (hm.get(key) > n / 3) {
                System.out.println(key);
            }
        }

    }

    public static void main(String args[]) {
        int[] arr = { 1, 2 };
        MajorityEle(arr);
    }
}