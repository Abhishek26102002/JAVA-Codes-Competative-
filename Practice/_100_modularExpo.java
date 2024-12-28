import java.util.*;


prb statement??

public class _100_modularExpo {
    public static long modularExponentiation(long x, long n, int m) {
        long res = 1;
        while (n > 0) {
            if (n % 2 != 0) {
                res = ((res) * (x) % m) % m;
            }
            x = ((x) % m * (x) % m) % m;
            n = n >> 1;// n=n/2
        }
        return res;
    }

    public static void main(String args[]) {

        System.out.println(modularExponentiation(4, 3, 10));


        
        /*
         * X = 4, N = 3, and M = 10
         * X ^ N = 4 ^ 3 = 64
         * X ^ N % M = 64 % 10 = 4.
         */
    }
}
