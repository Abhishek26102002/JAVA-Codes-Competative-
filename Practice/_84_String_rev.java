import java.util.*;

public class _84_String_rev {
    private static String rev(String s) {
        String str = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            str += s.charAt(i);
        }
        return str;
    }

    public static void main(String[] args) {

        String str = "Abhishek is good boy";
        System.out.println(rev(str));
    }
}