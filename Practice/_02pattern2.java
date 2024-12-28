import java.util.*;

public class _02pattern2 {
    public static void main(String args[]) {

        int n = 4;

        for (int i = 1; i <= n; i++) {
            // inner loop for increasing rows
            for (int j = 1; j <= n - i; j++) {  //or -> for(int j = n - i; j > 0; j--)
                // loop fro printing spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                // loop for printing stars
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
// *
// **
// ***
// ****
