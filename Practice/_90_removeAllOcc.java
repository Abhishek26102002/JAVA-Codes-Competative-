import java.util.*;

public class _90_removeAllOcc {
    public static String removeOccurrences(String str, String part) {
        while (str.contains(part)) {
            str = str.replaceFirst(part, "");
        }
        
        return str;
    }

    public static void main(String[] args) {

        String str = "daabcbaabcbc";
        String part = "abc";
        System.out.println(removeOccurrences(str, part));

    }
}