import java.util.*;

class _10ToprintDigit {
    public static void main(String args[]) {
        int number = 110102;
        while (number > 0) {
            int remainder = number % 10;
            System.out.print(remainder + " ");
            number = number / 10;
            // System.out.print(number + " ");
        }
    }
}
