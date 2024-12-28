import java.util.Stack;
//----------------------------Only Using recursion------------------------------

public class _139_Stack_Sort {
    public static Stack<Integer> SortedStack(Stack<Integer> s1, int num) {
        if (s1.empty() || (!s1.empty() && s1.peek() < num)) {
            s1.push(num);
            return s1;
        }

        int n = s1.pop();
        SortedStack(s1, num);
        s1.push(n);
        return s1;

    }
	public Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		if (s.empty()) {
            return s;
        }
        
        int num = s.pop();

        // Recursive call
        sort(s);

        //waps aate time sorted insert krna tha
        SortedStack(s, num);
        return s;
	}
}

//------------------------------------AlterNative-------------------------------------------

// Using Loop and recursion Also

class GfG{
	    public static Stack<Integer> insert(Stack<Integer> st, int x) {
        // base case
        if (st.isEmpty() || x < st.peek()) {
            st.push(x);
            return st;
        }

        int temp = st.peek();
        st.pop();
        insert(st, x);
        st.push(temp);

        return st;
    }

    public static Stack<Integer> sort(Stack<Integer> s) {
        Stack<Integer> s2 = new Stack<>();

        while (!s.empty()) {
            int x = s.peek();
            s.pop();
            s2.push(x);
        }

        while (!s2.empty()) {
            int x = s2.peek();
            s2.pop();

            // Check if s is empty or if x is less than the top element of s
            while (!s.empty() && x < s.peek()) {
                int temp = s.peek();
                s.pop();
                s2.push(temp);
            }

            s.push(x);
        }

        return s;
    }
}
