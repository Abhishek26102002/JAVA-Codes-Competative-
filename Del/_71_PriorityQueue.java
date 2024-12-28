import java.util.*;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Arrays;
import java.util.List;

    
public class _71_PriorityQueue {
public static void main(String[] args) {
    
    // comparator se hum khud priority set kr skte hai  .
    Queue<Integer> pq =new PriorityQueue<>(Comparator.reverseOrder());//max heap  we made it


    // Queue<Integer> pq =new PriorityQueue<>(Arrays.asList(3,4,5,6)); // min heap/order by default

    //PriorityQueue summons Queue  so it can access all the method of Queue as well
    pq.offer(8);
    pq.offer(3);
    pq.offer(2);
    pq.offer(45);
    pq.offer(421);
    pq.offer(1); // heighest  priority
    pq.offer(67);

    // priority is acc to weight of the element
    
    System.out.println(pq);
    
    pq.poll();
    System.out.println(pq);
    
    pq.poll();
    System.out.println(pq);
    
    pq.poll();
    System.out.println(pq);
    
    pq.poll();
    System.out.println(pq);
    
    pq.poll();
    System.out.println(pq);
    
    pq.poll();
    System.out.println(pq); 


    System.out.println("ele to be poped out is "+pq.peek());
    }
}