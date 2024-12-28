import java.util.*;

public class _35_Rec_reverseString {
    public static void printName(String name, int e) {
        if (e < 0) {
            return;
        }
        System.out.print(name.charAt(e));
        printName(name, e - 1);
    }

    public static void main(String args[]) {
        String name = "Abhishek";
        printName(name, name.length() - 1); // Start from the last character
    }
}
