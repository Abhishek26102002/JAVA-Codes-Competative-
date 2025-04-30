import java.util.*;

public class _01_AmountInWords {
    public static String solve(int num) {
        if (num == 0)
            return "zero";

        String[] ones = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen" };

        String[] tens = { "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety" };

        StringBuilder s = new StringBuilder();

        if (num >= 1000) {
            s.append(ones[num / 1000]).append(" thousand ");
            num %= 1000;
        }

        if (num >= 100) {
            s.append(ones[num / 100]).append(" hundred ");
            num %= 100;
        }

        if (num >= 20) {
            s.append(tens[num / 10]).append(" ");
            num %= 10;
        }

        if (num > 0) {
            s.append(ones[num]).append(" ");
        }

        return s.toString().trim();
    }

    public static void main(String args[]) {
        int num = 1010;
        System.out.println(solve(num)); // Output: one thousand ten
    }
}
