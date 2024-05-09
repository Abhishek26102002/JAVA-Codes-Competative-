import java.util.*;
import java.util.List;
import java.util.ArrayList;

public class _94_feez_buzz {

    public static List<String> fizzbuzz(int n) {

        List<String> s = new ArrayList<>();
        for (int num = 1; num <= n; num++) {

            if (num % 3 == 0 && num % 5 == 0) {
                s.add("FizzBuzz");
                continue;

            }
            if (num % 3 == 0) {
                s.add("Fizz");
                continue;
            }
            if (num % 5 == 0) {
                s.add("Buzz");
                continue;

            } else {
                s.add(String.valueOf(num));
            }
        }

        return s;

    }

    public static void main(String[] args) {

        int n = 15;
        System.out.println(fizzbuzz(n));

    }
}