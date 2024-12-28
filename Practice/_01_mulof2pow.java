import java.util.*;

class temp {

    public static boolean solve(int num) {

        while (num != 1) {
            if (num % 2 != 0) {
                return false;
            }
            num = num / 2;
        }
        return true;
    }
    public static void main(String args[]) {
        int n = 1024;

        System.out.println(solve(n));
    }
}
