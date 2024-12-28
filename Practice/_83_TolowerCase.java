import java.util.*;

public class _83_TolowerCase {
    public static char TolowerCase(char str) {
        if (str >= 'a' && str <= 'z') {
            return str;
        } else {
            char temp = (char) (str - 'A' + 'a'); // very imp U to low
            // L to U :: char temp = (char) (str - 'a' + 'A')
            return temp;
        }

    }

    // Method 2
    private static void lowerCase(String s) {
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            str += (char) (s.charAt(i) + 32);
        }

        System.out.println(str);

        // N.B= 'A' is 65(hex value) 'a' is 97 and to show that just do
        System.out.println('A' - 0);
        System.out.println('a' - 0);

    }

    public static void main(String[] args) {

        char str = 'S';
        System.out.println(TolowerCase(str));

    }
}