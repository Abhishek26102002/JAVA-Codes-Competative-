import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class z_01_Queue {
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();

        Queue<Integer> adq = new ArrayDeque<>(); // ALL methods valid for adq as well

        // Adding elements to the queue
        q.offer(10); // Adds an element to the rear of the queue
        q.offer(30);
        adq.offer(20);
        q.add(34); // another method of adding

        q.poll(); // Retrieves and removes the head of the queue

        q.peek(); // Retrieves, but does not remove, the head of the queue

        q.isEmpty(); // boolean to check empty

        q.size(); // size of queue

        q.remove(10); // remove an object

        q.remove(); // remove top of queue

        q.clear(); // clear all the queue

        ((LinkedList<Integer>) q).get(0); // get ele at specific index

        ((LinkedList<Integer>) q).set(0, 89); // get ele at specific index

    }
}
