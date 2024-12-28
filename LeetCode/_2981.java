import java.util.*;
// Q. 2981
// 362 testcase passed

public class _2981 {

    public static int maximumLength(String s) {
        int[] arr = new int[26];

        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        int max = 0;
        int maxOcc = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 3) {
                max = i;
                maxOcc = arr[i];
            }
        }
        if (maxOcc < 3) {
            return -1;
        }
        int count = 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i) && s.charAt(i)==(char)('a'+max)) {
                count++;
            }
        }
        return count == 0 ? 1 : count-1;
    }

    public static void main(String args[]) {
        // String s= "aaaa";
        // String s = "abcdef";

        String s = "abcaba";
        System.out.println(maximumLength(s));

    }
}