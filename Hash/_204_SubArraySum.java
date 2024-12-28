import java.util.*;

class Solution // O(n^2) --- TLE
{
    static int findSubArraySum(int arr[], int n, int k) {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (k == sum) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}

// still didn't get it !

class Solution2 {
    static int findSubArraySum(int arr[], int N, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int ans = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        return ans;
    }
}