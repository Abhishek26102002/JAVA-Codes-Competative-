import java.util.*;

public class _62_mySqrt {
    public static long mySqrt(long num) {
        long s = 0, e = num;
        long mid = (e + s) / 2;
        long ans = -1;
        while (s <= e) {
            if (mid * mid > num) {
                e = mid - 1;
            }
            if (mid * mid < num) {
                ans = mid;
                s = mid + 1;
            }
            if (mid * mid == num) {
                return mid;
            }
            mid = (e + s) / 2;

        }
        return ans;

    }

    public static double pression(long num, long tempsol, int precount) {
        double pre = 1;
        double ans = tempsol;
        for (int i = 0; i < precount; i++) {
            pre = pre / 10;
            for (double j = ans; j * j < num; j = j + pre) {
                ans = j;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        long num = 169;
        long tempsol = mySqrt(num);
    //    System.out.println(pression(num, tempsol, 3));
    System.out.println(tempsol);
    }
}
