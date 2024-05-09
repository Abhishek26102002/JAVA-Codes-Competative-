import java.util.*;

public class _82_palindromeString {
    public static boolean palindrome(String str) {
        char[] charArray = str.toCharArray();
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {

        String input ="abba"; //"?1sfdg21!11?";

        String str =input.toLowerCase();// ignoring case // lower case method also created see _83_Tolowercase
      
        boolean ans=palindrome(str);
        System.out.println(ans);
    }
}