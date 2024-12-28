// Put all 'e' in end of String
import java.util.*;

public class _09moveAchar {
    // Method 1  rec method also available check further
    public static String solve(String str) {
        int cnt = 0;

        String ans = "";

        char[] StrToChar = str.toCharArray();

        for (char x : StrToChar) {
            if (x != 'e') {
                ans += x;
            } else {
                cnt++;
            }
        }

        for (int i = 0; i < cnt; i++) {
            ans += 'e';
        }
        return ans;
    }
}