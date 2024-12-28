import java.util.*;

public class _11MappingofStringToInteger {

    public static void main(String args[]) {
        String digit = "23";
        String[] Keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

        for (int i = 0; i < digit.length(); i++) {
            int d = digit.charAt(i) - '0'; // char to digit
            System.out.println(Keypad[d]);
        }
    }
}