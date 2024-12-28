import java.util.*;

public class _27_Rec_SumOfNum {
    public static int sumOfNum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sumOfNum(n - 1);
    }

    public static void main(String args[]) {
        int n = 10;
        System.out.println(sumOfNum(n));
    }
}
