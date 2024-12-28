import java.util.*;

public class _36_Rec_DigitToNum {
    public static void sayDigit(int n, String arr[]) {
        if (n == 0) {
            return;
        }
        int digit = n % 10;
        n = n / 10;
        sayDigit(n, arr);
        System.out.print(arr[digit] + " ");

    }

    public static void main(String args[]) {
        int n = 421;
        String arr[] = { "zero", "One", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        sayDigit(n, arr);
    }
}