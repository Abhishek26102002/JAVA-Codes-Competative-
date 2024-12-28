import java.util.*;

public class _89_maxOccOfEle {

    private static char maxOcc(String s) {
        int[] arr = new int[26];
        int max = 0;
        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // for handeling space char
            if (ch >= 'a' && ch <= 'z') {
                arr[ch - 'a'] += 1;
            }
        }

        for (int i = 0; i < 26; i++) {
            if (max < arr[i]) {
                max = arr[i];
                ans = i;
            }
        }

        return (char) (ans + 'a');
    }

    public static void main(String[] args) {
        String str = "sample string";
        System.out.println("Max occurring character is ==> " + maxOcc(str));

    }
}

// more method also availabe check Geeks for Geeks