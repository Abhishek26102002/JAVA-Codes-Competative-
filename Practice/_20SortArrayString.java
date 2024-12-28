import java.util.Arrays;

public class _20SortArrayString {

    public static void main(String args[]) {
        String arr = "dcba";
        char[] chr = arr.toCharArray();

        // Using Arrays Method
        Arrays.sort(chr);
        for (int i = 0; i < arr.length(); i++) {
            System.out.print(chr[i]);

        }
    }
}