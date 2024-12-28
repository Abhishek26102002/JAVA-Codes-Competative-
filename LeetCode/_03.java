import java.util.HashMap;

public class _03 {
    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int maxLength = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                start = Math.max(start, map.get(ch) + 1);
            }
            map.put(ch, i);
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }

    public static void main(String args[]) {
        String s = "dvdf"; // "wke" is 1st and largest substring that has no repeted words
        System.out.println(lengthOfLongestSubstring(s));

    }
}
