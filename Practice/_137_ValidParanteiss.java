import java.util.Stack;

class Solution {
    public String minRemoveToMakeValid(String s) {
        int open = 0;
        StringBuilder str = new StringBuilder(s);

        // travelling from left to right
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                open++;
            } else if (str.charAt(i) == ')') {
                if (open > 0)
                    open--;
                else {
                    str.deleteCharAt(i);
                    i--;
                }
            }
        }

        // travelling from right to left
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == '(' && open > 0) {
                str.deleteCharAt(i);
                open--;
            }
        }

        return str.toString();
    }
}
