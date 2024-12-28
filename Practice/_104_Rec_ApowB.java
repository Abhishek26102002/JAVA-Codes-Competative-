import java.util.*;

public class _104_Rec_ApowB {
    public static int apowb(int a, int b) {
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        if (a == 0) {
            return 0;
        }
        int ans = apowb(a, b / 2);
        // if b is even
        if (b % 2 == 0) {

            return ans * ans;

        } else {
            return a * ans * ans;
        }
    }

    // or
    // no of iteration equals to no of b -- time and space incereases
    public static int rec(int a, int b) {
        if (b == 0) {
            return 1;
        }
        return a * rec(a, b - 1);

    }

    public static void main(String args[]) {
        System.out.println(apowb(2, 10));

    }
}
