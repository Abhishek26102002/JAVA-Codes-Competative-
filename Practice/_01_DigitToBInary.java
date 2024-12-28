import java.util.*;
import java.util.Scanner;

public class _01_DigitToBInary {
    public static int power(int a, int b) {
        if (a == 0) {
            return 0;
        }
        if (b == 0) {
            return 1;
        }
        return a * power(a, b - 1);
    }

    public static void main(String args[]) {

        // System.out.println(power(3, 0));
        Scanner num = new Scanner(System.in);// object of scanner

        System.out.println("Enter the Digit");
        int n = num.nextInt();

        int ans = 0;
        int i = 0;
        while (n != 0) {
            int bit = n & 1;// storing ans into bit variable/
            n = n >> 1;
            ans = bit * power(10, i) + ans;
            i++;
        }
        System.out.println(num + " in binary is : " + ans);

    }
}