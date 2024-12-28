import java.util.Stack;

public class _137_Stack_insertAtBottom {

    public Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {

        // base case
        if(st.empty()){
            st.push(x);
            return st;
        }

        int temp=st.peek();
        st.pop();
        insertAtBottom(st, x);

        //return call
        st.push(temp);

        return st;
    }

}
