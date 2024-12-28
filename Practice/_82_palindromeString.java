import java.util.*;

public class _82_palindromeString {
    public static boolean palindrome(String str) {
        int s = 0;
        int e = str.length() - 1;

        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    public static void main(String[] args) {

        String input = "abba"; // "?1sfdg21!11?";

        String str = input.toLowerCase();// ignoring case // lower case method also created see _83_Tolowercase

        boolean ans = palindrome(str);
        System.out.println(ans);
    }
}