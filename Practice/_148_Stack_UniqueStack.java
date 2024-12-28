import java.util.Stack;

// Practice Logic Once Again ; cant understand the logic clearly

public class _148_Stack_UniqueStack {

    class GfG {
        int minEle;
        Stack<Integer> s;

        // Constructor
        GfG() {
            this.minEle = Integer.MAX_VALUE;
            this.s = new Stack<>();
        }

        /* returns min val from stack */
        int getMin() {
            if (s.isEmpty()) {
                return -1;
            }
            return minEle;
        }

        /* returns poped val from stack */
        int pop() {
            if (s.isEmpty()) {
                return -1;
            }
            int val = s.pop();
            int temp = 2 * minEle - val;
            if (val < minEle) {
                int ans = minEle;
                minEle = temp;
                return ans;
            } else {
                return val;
            }
        }

        /* push val x into the stack */
        void push(int x) {
            if (s.isEmpty()) {
                s.push(x);
                minEle = x;
                return;
            }
            if (x < minEle) {
                int temp = 2 * x - minEle;
                s.push(temp);
                minEle = x;
            } else {
                s.push(x);
            }
        }

        // Code End
    }
}
