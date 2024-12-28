import java.util.*;

public class _10_ReverseInteger {
    public static void main(String args[]) {
        int number = 19023;
        int ans = 0;
        while (number > 0) {
            int remainder = number % 10;
            ans = (ans * 10) + remainder;
            number = number / 10;
        }
        System.out.println(ans);
    }
}