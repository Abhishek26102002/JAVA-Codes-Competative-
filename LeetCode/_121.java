import java.util.*;

public class _121 {
    public static int max(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0; // No ans can be made with less than 2 prices
        }

        int min = Integer.MAX_VALUE;
        int max = 0;

        for (int x : prices) {
            // Update minimum x if a lower x is found
            if (x < min) {
                min = x;
            }

            // Calculate potential ans and update maximum ans
            int ans = x - min;
            if (ans > max) {
                max = ans;
            }
        }

        System.out.println(max);
        return max;
        // End
    }

    public static void main(String args[]) {
        int[] prices = { 2, 1, 2, 1, 0, 0, 1 };
        max(prices);

    }
}