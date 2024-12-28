import java.util.*;

public class _88_reverseIndiviString {
    public static String reverseWord(String str) {
        String temp = new String();
        int i = 0;
        int n = str.length();

        while (i < n) {
            while (i < n && str.charAt(i) == ' ') {
                i++;
            }
            if (i >= n)
                break;
            int j = i + 1;

            while (j < n && str.charAt(j) != ' ') {
                j++;
            }
            String sub = str.substring(i, j);
            if (temp.length() == 0) {
                temp = sub;

            } else {
                temp = sub + " " + temp;
            }
            i = j + 1;
        }
        return temp;
    }

    // Method 2
    private static String reverseWord2(String s) {
        String str = "";
        String ans = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }

        int i = 0, j = 0;
        while (str.length() > j) {
            if (str.charAt(j) == ' ') {
                for (int m = j; m >= i; m--) {
                    ans += str.charAt(m);
                }
                i = j + 1;
            }
            j++;
        }
        ans+=" ";
        for (int m = j-1; m >= i; m--) {
            ans += str.charAt(m);
        }

        return ans;
    }

    public static void main(String args[]) {
        String str = "the sky is blue";

        System.out.println(reverseWord(str));
    }
}