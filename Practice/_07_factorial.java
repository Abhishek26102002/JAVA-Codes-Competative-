import java.util.*;

//defineing funtion and its performance
public class _07_factorial {

    public static int printFactorial(int n) {
        // System.out.println(a+b);
        int Factorial = 1;
        for (int i = 1; i <= n; i++) {
            Factorial = Factorial * i;
        }
        return Factorial;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(printFactorial(n));

    }

}