import java.util.*;
import java.util.ArrayList;
import java.util.List;

public class _109_Rec_LetterCombination {
    public static void solve(String digits, String output, int index, String[] map, List<String> ans) {
        // base case
        if (index >= digits.length()) {
            ans.add(output);
            return;
        }
        int number = digits.charAt(index) - '0';// return Int of number form stirng of number
        String val = map[number]; // mapping of crossponding number // 2- "abc" & 3-"def".

        for (int i = 0; i < val.length(); i++) {
            char ch = val.charAt(i);
            solve(digits, output + ch, index + 1, map, ans);
        }

    }

    public static List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) {
            return ans;
        }
        String output = "";
        int index = 0;
        String[] map = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        solve(digits, output, index, map, ans);
        return ans;
    }

    public static void main(String args[]) {
        String digits = "23";
        System.out.println(letterCombinations(digits));
    }
}