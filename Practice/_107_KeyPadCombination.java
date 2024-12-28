import java.util.ArrayList;

// Back Track (poping so that u send the original string while coming back)
// Three recursion Calls i.e three branches of tree

class _107_KeyPadCombination {

    public static void solve(String digits, String output, int index, String[] mapping, ArrayList<String> ans) {
        if (index >= digits.length()) {
            ans.add(output);
            return;
        }

        int num = digits.charAt(index) - '0';// e.g=1
        String val = mapping[num];// e.g =abc

        for (int i = 0; i < val.length(); i++) {
            solve(digits, output + val.charAt(i), index + 1, mapping, ans);
        }

    }

    public static ArrayList<String> letterComb(String digits) {

        ArrayList<String> ans = new ArrayList<>();
        String output = "";
        int index = 0;
        String[] mapping = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };
        solve(digits, output, index, mapping, ans);

        return ans;
    }

    public static void main(String args[]) {
        String digits = "45";

        System.out.println(letterComb(digits));
    }
}