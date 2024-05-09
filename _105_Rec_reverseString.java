import java.util.*;

public class _105_Rec_reverseString {
    public static void swap(char[] ch, int s, int e) {
        char temp = ch[s];
        ch[s] = ch[e];
        ch[e] = temp;
    }

    public static char[] RevString(String str, int s, int e) {
        char[] ch = str.toCharArray();
        if (s > e) {
            return ch;
        }

        swap(ch, s, e);
        RevString(str, s + 1, e - 1);
        return ch;

    }

    public static void main(String args[]) {
        String str = "Abhishek";
        int s = 0, e = str.length() - 1;
        char[] ans = RevString(str, s, e);
        for (char c : ans) {
            System.out.print(c);
        }
        // or to String // charArray.toString = String.
        ans.toString();
        System.out.println(ans);
    }
}