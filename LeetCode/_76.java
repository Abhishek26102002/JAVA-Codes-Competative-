import java.util.*;

public class _76 {
    public static String minWindow(String s, String t) {
        Map<Character, Boolean> map1 = new HashMap<>();
        Map<Character, Boolean> map2 = new HashMap<>();

        StringBuilder ans = new StringBuilder(); // Using StringBuilder

        if (t.length() > s.length()) {
            return "";
        }

        for (char c : s.toCharArray()) {
            map1.putIfAbsent(c, true);
        }
        for (char c : t.toCharArray()) {
            map2.putIfAbsent(c, true);
        }

        for (int i = 0; i < t.length(); i++) {
            if (!map1.containsKey(t.charAt(i))) {
                return "";
            }
        }

        int i = 0, j = 0;
        int k = t.length();
        for (int x = 0; x < s.length(); x++) {
            if (map2.containsKey(s.charAt(x))) {
                j++;
                k--;
                ans.append(s.charAt(x));
            } else if (k == 0 && s.length() - 1 - x != 0) {
                k = t.length();
                // create a new String that might contain potential ans
                ans.append(" ");

            } else if (!map2.containsKey(s.charAt(x)) && k < t.length() && k != 0) {
                j++;
                ans.append(s.charAt(x));
            } else if (!map2.containsKey(s.charAt(x)) && k == t.length()) {
                j++;
                i = j;
            }

        }

        return ans.toString();
    }

    public static void main(String args[]) {
        String s = "ADOBECODEBANC", t = "ABC";

        System.out.println(minWindow(s, t));
    }
}