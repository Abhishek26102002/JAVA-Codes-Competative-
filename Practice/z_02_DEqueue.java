import java.util.ArrayDeque;
import java.util.Deque;

public class z_02_DEqueue {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10); // Adds an element to the front of the dq
        dq.addLast(20); // Adds an element to the rear of the dq

        dq.removeFirst();
        dq.removeLast();
        dq.remove(10);
        dq.remove();

        dq.removeFirstOccurrence(10);

        dq.pollFirst();
        dq.pollLast();

        dq.peek();
        dq.peekFirst();
        dq.peekLast();

        dq.clear();

        dq.isEmpty();

        dq.pop();
        dq.push(34);

        dq.size();

    }

}
