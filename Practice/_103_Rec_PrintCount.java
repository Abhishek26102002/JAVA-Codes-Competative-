import java.util.*;

public class _103_Rec_PrintCount {
    public static void CountNum(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);// print 10 to 1 // tail recursion
        CountNum(n - 1);
        System.out.println(n);// print 1 to 10  // Head recursion
    }

    public static void main(String args[]) {
        int n = 10;
        CountNum(n);
    }
}