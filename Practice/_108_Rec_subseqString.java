import java.util.*;
import java.util.ArrayList;

public class _108_Rec_subseqString {

    public static void solve(String str, String output, ArrayList<String> ans, int index) {
        // base
        if (index >= str.length()) {
            if (output.length() > 0) {
                ans.add(output); // add the subsequence represented by output
            }
            return;
        }
        // exclude
        solve(str, output, ans, index + 1);

        char ch = str.charAt(index);
        output += ch; // append the character to the output
        solve(str, output, ans, index + 1);
    }

    public static ArrayList<String> subsequences(String str) {
        ArrayList<String> ans = new ArrayList<>();
        String output = ""; // empty string to represent an empty subsequence
        int index = 0;
        solve(str, output, ans, index);

        return ans;
    }

    public static void main(String args[]) {
        String str = "abc";
        System.out.println(subsequences(str));
    }
}
