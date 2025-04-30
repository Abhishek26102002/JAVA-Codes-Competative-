import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _03 {

    // brute force //TL
    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (allUnique(s, i, j)) {
                    maxLength = Math.max(maxLength, j - i + 1);
                }
            }
        }
        return maxLength;
    }

    private static boolean allUnique(String s, int start, int end) {
        boolean[] chars = new boolean[255]; // Assuming ASCII characters

        for (int i = start; i <= end; i++) {
            if (chars[s.charAt(i)]) {
                return false; // Duplicate found
            }
            chars[s.charAt(i)] = true;
        }
        return true;
    }
    // end brutforce

    public static int lengthOfLongestSubstringg(String s) {
        int n = s.length();
        HashSet<Character> map = new HashSet<>();

        int maxLength = 0;
        int left = 0;

        // Expand window by moving 'right'
        for (int right = 0; right < n; right++) {

            // If a duplicate is found, shrink the window from the left
            while (map.contains(s.charAt(right))) {
                map.remove(s.charAt(left));
                left++;
            }

            // Add current character to window and update max length
            map.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1); // right - left + 1 --size of window
        }
        return maxLength;
    }

    public static void main(String args[]) {
        String s = "dvdf";
        System.out.println(lengthOfLongestSubstringg(s));

    }
}
