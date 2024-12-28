// package AmountInWords;

import java.util.*;

public class _01_AmountInWords {

    private static  String[] ONES = new String[] { "", "one", "two", "three", "four", "five", "six", "seven","eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen","eighteen", "nineteen" };

    private static  String[] TENS = new String[] { "", "", "twenty", "thirty", "forty", "fifty", "sixty","seventy", "eighty", "ninety" };

    public String convertAmountToWords(int amount) {
        if (amount < 0 || amount > 100000) {
            throw new IllegalArgumentException("Amount must be between 0 and 100000");
        }

        String words = "";

        // Thousands place
        int thousands = amount / 1000;
        if (thousands > 0) {
            words += ONES[thousands] + " thousand";
            amount %= 1000;
        }

        // Hundreds place
        int hundreds = amount / 100;
        if (hundreds > 0) {
            words += " " + ONES[hundreds] + " hundred";
            amount %= 100;
        }

        // Tens place
        int tens = amount / 10;
        if (tens > 0) {
            words += " " + TENS[tens];
            amount %= 10;
        }

        // Ones place
        if (amount > 0) {
            words += " " + ONES[amount];
        }

        return words;
    }

    public static void main(String[] args) {
        _01_AmountInWords converter = new _01_AmountInWords();
        String words = converter.convertAmountToWords(12345);
        System.out.println(words);
    }
}
