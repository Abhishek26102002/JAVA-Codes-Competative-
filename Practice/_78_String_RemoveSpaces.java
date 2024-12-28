import java.util.Arrays;

public class _78_String_RemoveSpaces {
    public static String StringReplace(String str, String key) {
        String s = "";

        int count = 0;
        while (count != str.length()) {

            if (str.charAt(count) == ' ') {
                s += key;
            } else {
                s += str.charAt(count);
            }
            count++;
        }
        return s;
    }

    public static void main(String args[]) {
        String str = "Abhishek is my name";
        String from = "@40";

        System.out.println(StringReplace(str, from));

    }
}