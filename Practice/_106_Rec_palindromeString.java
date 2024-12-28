import java.util.*;

public class _106_Rec_palindromeString {

    public static Boolean checkPlaindrome(String str, int s, int e) {
        if (s > e) {
            return true;
        }

        if (str.charAt(s) != str.charAt(e)) {
            return false;
        } else {
            checkPlaindrome(str, s + 1, e - 1);
        }
        return true;
    }

    public static void main(String args[]) {
        String str = "BookkooB";
        System.out.println(checkPlaindrome(str, 0, str.length() - 1));

    }
}