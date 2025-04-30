import java.util.*;

public class temp {
    public static ArrayList<Integer> solve(int num) {
        ArrayList<Integer> arr = new ArrayList<>();

        while (num != 0) {
            int rem = num % 10;
            arr.add(rem);
            num /= 10;
        }
        return arr;
    }

    public static void main(String args[]) {
        int num = 1010;
        System.out.println(solve(num));
    }
}