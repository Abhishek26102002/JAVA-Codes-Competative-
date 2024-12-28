import java.util.Stack;

public class _138_Stack_reverseStack {
    public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
        // --> time 0.69 sec
        // base case
        if (st.empty()) {
            st.push(x);
            return st;
        }

        int temp = st.peek();
        st.pop();
        insertAtBottom(st, x);
        st.push(temp);

        return st;
    }

    static void reverse(Stack<Integer> s) {
        // base case
        if (s.empty()) {
            return;
        }

        int n = s.peek();
        s.pop();
        reverse(s);
        insertAtBottom(s, n);

    }

    // simple way
}

// User function Template for Java 
//time = 0.43 sec
class Solution {
    static void reverse(Stack<Integer> s) {
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();
        while (!s.empty()) {
            int n = s.peek();
            s.pop();
            s2.push(n);
        }
        while (!s2.empty()) {
            int n = s2.peek();
            s2.pop();
            s3.push(n);
        }
        while (!s3.empty()) {
            int n = s3.peek();
            s3.pop();
            s.push(n);
        }
    }
}