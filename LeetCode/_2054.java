import java.util.*;

// This is working for 3 max events asuming that max two overlap
// Q. Leetcode 2054
public class _2054 {
    public int maxTwoEvents(int[][] events) {
        int ans = 0;
        for (int i = 0; i < events.length; i++) {
            for (int j = i + 1; j < events.length; j++) {
                if (events[i][1] <= events[j][0]) {
                    int temp = events[i][2] + events[j][2];
                    ans = Math.max(ans, temp);
                }
            }
        }

        for (int i = 0; i < events.length; i++) {
            ans = Math.max(events[i][2], ans);
        }
        return ans;
    }

    public static void main(String args[]) {

    }
}