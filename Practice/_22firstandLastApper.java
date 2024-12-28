import java.util.*;

public class _22firstandLastApper {
    public static int first = -1;
    public static int last = -1;

    // Just a for loop in Rec
    public static void find(String str, int s, int e, char find) {
        if (s > e) {
            return;
        }
        if (find == str.charAt(s)) {
            if (first == -1) {
                first = s;
            } else {
                last = s;
            }
            
        }

        find(str, s + 1, e, find);

    }

    public static void main(String args[]) {
        String str = "abbabbcajskbhcak";
        find(str, 0, str.length() - 1, 'a');
        System.out.println(first);
        System.out.println(last);
    }
}