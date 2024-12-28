import java.util.ArrayList;
import java.util.HashMap;

public class _206_Hash_UniqInWindowK {

    ArrayList<Integer> countDistinct(int A[], int n, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < k; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], map.get(A[i]) + 1);
            } else {
                map.put(A[i], 1);
            }
        }

        arr.add(map.size());

        for (int i = k; i < n; i++) {
            if (map.get(A[i - k]) == 1) {
                map.remove(A[i - k]);
            } else {
                map.put(A[i - k], map.get(A[i - k]) - 1);
            }
            map.put(A[i], map.getOrDefault(A[i], 0) + 1);
            arr.add(map.size());
        }

        return arr;
    }

}
// this -- 

// map.put(A[i], map.getOrDefault(A[i], 0) + 1);

//can also written as--

// if (map.containsKey(A[i])) {
// map.put(A[i], map.get(A[i]) + 1);
// } else {
// map.put(A[i], 1);
// }