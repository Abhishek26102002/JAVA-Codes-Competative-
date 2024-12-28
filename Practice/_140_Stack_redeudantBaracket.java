import java.util.Stack;

public class _140_Stack_redeudantBaracket {
    public static int Redudant(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '+' || ch == '-' || ch == '/' || ch == '*') {
                stack.push(ch);
            } else {
                // iske alawa close bracjet hoga and eng alphabate ko ignre kr denge
                if (ch == ')') {
                    int isRedundant = 1;
                    while (stack.peek() != '(') {
                        char top = stack.peek();
                        if (top == '+' || top == '-' || top == '/' || top == '*') {
                            isRedundant = 0;
                        }
                        stack.pop(); // for operator

                    }
                    if (isRedundant == 1) {
                        return 1;

                    }
                    stack.pop(); // for opening bracket if found
                }
            }
        }
        return 0;

    }

}
