import java.util.Queue;
import java.util.Stack;

class _154_Queue_reverseKele {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {

        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < k; i++) {
            s.push(q.poll());
        }

        for (int i = 0; i < k; i++) {
            q.add(s.pop());
        }

        for (int i = 0; i < q.size() - k; i++) {
            int x = q.peek();
            q.poll();
            q.add(x);
        }

        return q;

    }
}
