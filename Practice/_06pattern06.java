import java.util.*;

public class _06pattern06 {
    public static void main(String args[]) {
        int n = 5;
        // ****
        // *  *
        // *  *
        // *  *
        // ****
        int cnt = 0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                if (i == 1 || i == 4) {
                    System.out.print("*");
                } else {
                    if (j == 1 || j == 4) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }

            }
            System.out.println();
        }
    }
}
// ****
// *  *
// *  *
// *  *
// ****