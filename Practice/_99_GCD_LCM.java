import java.util.*;

public class _99_GCD_LCM {
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        // OR
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }

    public static void main(String args[]) {
        int a = 56, b = 98;
        int GCD = GCD(a, b);
        System.out.println("GCD is :" + GCD);

        System.out.println("LCM is :" + (a * b) / GCD);

    }
}
// time complexity =O(log n)