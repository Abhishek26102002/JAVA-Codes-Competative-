import java.util.Stack;

public class _142_Stack_minimumCostLeetCode {
      public static int findMinCost(String s) {

        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(s.charAt(i));
            } else {
                if (!st.empty() && st.peek() == '(') {
                    st.pop();
                } else {
                    st.push(s.charAt(i));
                }
            }
        }

        int a = 0, b = 0;
        while (!st.empty()) {
            if (st.peek() == '(') {
                a++;
            } else {
                b++;
            }
            st.pop();
        }

        return a+b;
    }
    
}
