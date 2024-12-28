import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class _157_Queue_InterleaveQueue {
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> temp = new ArrayDeque<>();

        for (int i = 0; i < N / 2; i++) {
            temp.add(q.poll());
        }
        while (!q.isEmpty()) {
            ans.add(temp.poll());
            ans.add(q.poll());
        }

        return ans;
    }

}
