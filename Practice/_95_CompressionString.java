import java.util.*;

public class _95_CompressionString {
    public static String compress(char[] ch) {
        int count = 1;
        String s = "";

        int i = 0;

        while (i < ch.length - 1) { // This is how window slides in one loop
            int j = i + 1;
            if (ch[i] == ch[j]) {
                count++;
            } else {
                s += ch[i] + "" + count;
                count = 1; // Reset count for the new character
            }
            i++;
        }

        // Handle the last character and its count
        s += ch[i] + "" + count;

        return s;
    }

    public static void main(String args[]) {
        char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c' };

        System.out.println(compress(chars));
    }
}
/*User
public class _95_CompressionString {
    public static String compress(char[] ch) {
        int count = 1;
        String s = " ";
        int i = 0;
        while (i <= ch.length) {
            int j = i + 1;
            if (ch[i] == ch[j] && j < ch.length) {
                count++;
                s = "" + ch[i] + count;
            }
            i++;

        }

        return s;

    } */