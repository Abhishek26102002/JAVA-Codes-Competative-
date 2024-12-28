
import java.util.*;

public class String_Cyclic {

    public static boolean canMakeSubsequence(String str1, String str2) {
        int x = 0, y = 0;

        while (x < str1.length() && y < str2.length()) {
            if (str1.charAt(x) - 'a' == str2.charAt(y) - 'a'
                    || (str1.charAt(x) - 'a' + 1) % 26 == str2.charAt(y) - 'a') {
                y++;
            }
            if (y == str2.length()) {
                return true;
            }
            x++;
        }

        return false;
    }

    public static void main(String args[]) {
        String str1 = "zc";
        String str2 = "ad";

        System.out.println(canMakeSubsequence(str1, str2));

    }
}