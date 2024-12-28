import java.util.*;

public class _424 {
    public static int characterReplacement(String s, int k) {
        int ans = 0;
        int n = s.length();
        for (char c = 'A'; c <= 'Z'; c++) {
            int i = 0, j = 0, replaced = 0;
            while (j < n) {
                if (s.charAt(j) == c) {
                    j++;
                } else if (replaced < k) {
                    j++;
                    replaced++;
                } else if (s.charAt(i) == c) {
                    i++;
                } else {
                    i++;
                    replaced--;
                }
                ans = Math.max(ans, j - i);
            }
        }
        return ans;
    }

    public static int characterReplacement2(String s, int k) {
        int[] count = new int[26];
        int i = 0, j = 0, max = Integer.MIN_VALUE;
        int result = Integer.MIN_VALUE;
        while (i < s.length()) {
            count[s.charAt(i) - 'A']++;
            max = Math.max(max, count[s.charAt(i) - 'A']);
            if (i - j - max + 1 > k) {
                count[s.charAt(j) - 'A']--;
                j++;
            }
            result = Math.max(result, i - j + 1);
            i++;
        }
        return result;
    }

    public static void main(String args[]) {
        String s = "AABABBBBAB";
        int k = 1;
        System.out.println(characterReplacement(s, k));
    }
}