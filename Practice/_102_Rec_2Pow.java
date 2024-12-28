import java.util.*;

public class _102_Rec_2Pow {
    public static int powr(int n) {
        if (n == 0) {
            return 1;
        }
        return 2 * powr(n - 1); // rec relation
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.println("2^" + n + " is " + powr(n));
    }
}