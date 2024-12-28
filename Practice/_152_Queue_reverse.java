import java.util.Queue;
import java.util.Stack;

public class _152_Queue_reverse {
    // Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q) {
        // add code here.
        Stack<Integer> s = new Stack<>();
        int size = q.size();

        // Pushing elements from queue to stack
        for (int i = 0; i < size; i++) {
            s.push(q.poll());
        }

        // Adding elements back to the queue from stack
        for (int i = 0; i < size; i++) {
            q.add(s.pop());
        }

        return q;
    }

    //using recursion
    class GfG{
        //Function to reverse the queue.
        void solve(Queue<Integer> q){
        // base case
        if(q.isEmpty()){
            return;
        }  
        int n=q.poll();
        solve(q);
        q.add(n);
    }
        public Queue<Integer> rev(Queue<Integer> q){
          solve(q);
          return q;
        }
    }
}
