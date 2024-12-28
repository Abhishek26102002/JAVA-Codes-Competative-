import java.util.*;

public class _101_Rec_factorial {
    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

    public static void main(String args[]) {
        int n = 5;
        System.out.println("fac of " + n + " is " + fac(n));
    }
}