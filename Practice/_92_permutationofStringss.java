import java.util.*;
import java.util.Arrays;

//Q. Check if any of the perutation of string s2 present in s1 ?

class _92_permutationofStringss {
    public static boolean checkInclusion(String s2, String s1) {
        if (s2.length() > s1.length()) {
            return false;
        }
        int[] fs1 = new int[26];
        int[] fs2 = new int[26];

        int k = s2.length();

        for (int i = 0; i < k; i++) {
            fs2[s1.charAt(i) - 'a']++; // e
            fs1[s2.charAt(i) - 'a']++; // a
        }

        if (Arrays.equals(fs1, fs2)) {
            return true;
        }

        for (int i = k; i < s1.length(); i++) {
            fs2[s1.charAt(i - k) - 'a']--; // e ko remove kr die
            fs2[s1.charAt(i) - 'a']++; // d ko add kr lie
            if (Arrays.equals(fs1, fs2)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s1 = "eidbaooo";
        String s2 = "ab";

        System.out.println(checkInclusion(s2, s1));
    }
}