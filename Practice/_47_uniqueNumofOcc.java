import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class _47_uniqueNumofOcc {

    static int countDistinct(int arr[], int n) {
        int count = 1;

        for (int i = 1; i < n; i++) {
            int j = 0;
            for (j = 0; j < i; j++)
                if (arr[i] == arr[j])
                    break;

            if (i == j)
                count++;
        }
        return count;
    }

    // Method 2  -- Map (easy + imp + fast)
    private static int unieles(int[] arr) {
        int cnt = 0;

        Map<Integer, Integer> m = new HashMap<>();

        for (int x : arr) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
        
        // System.out.println(m); -- debug

        // for(Entry<Integer,Integer> x:m.entrySet()){
        // if(x.getValue()==1){
        // cnt++;
        // }
        // }

        // or

        // for counting only unique ele
        for (int x : m.values()) {
            if (x == 1) {
                cnt++;
            }
        }

        // for distinct ele just return length or hashMap
        return cnt;
    }

    public static void main(String[] args) {
        int arr[] = { 12, 10, 9, 45, 2, 10, 10, 45 };
        int n = arr.length;

        System.out.println(countDistinct(arr, n));
        // System.out.println(unieles(arr));

    }
}
// can be done using
// sorting
// hashing(all method related to hasing)
// also done using mapping