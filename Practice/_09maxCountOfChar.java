
import java.util.*;

public class _09maxCountOfChar {
    static public int maxCountOfChar(String s, int k) {

        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), count++);
            } else {
                map.put(s.charAt(i), 1);
            }
            max = Math.max(max, map.get(s.charAt(i)));
        }

        return max;

    }

    public static void main(String args[]) {
        String s = "AABABBA";
        int k = 1;

        System.out.println(maxCountOfChar(s, k));
    }
}
