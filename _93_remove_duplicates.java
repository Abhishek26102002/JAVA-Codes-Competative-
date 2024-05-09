import java.util.*;

class _93_remove_duplicates {
    public static String solve(String str) {
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i); // very clever method
            if (temp.contains(ch)) {
                continue;
            }
            temp = temp + ch;

        }

        return temp;

    }

    public static void main(String[] args) {
        String str = "abcabcabc";

        System.out.println(solve(str));

    }
}