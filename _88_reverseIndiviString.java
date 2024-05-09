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

    public static void main(String args[]) {
        String str = "the sky is blue";

        System.out.println(reverseWord(str));
    }
}