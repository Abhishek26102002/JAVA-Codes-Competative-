import java.util.*;
import java.util.ArrayDeque;

public class _72_ArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        adq.offer(12);
        adq.offer(1);
        adq.offer(2);
        adq.offerFirst(24); // add ele at first
        adq.offerLast(36); // add ele at last but act same as offer
        adq.offer(52);
        adq.offer(324);
        adq.offer(412);


        System.out.println(adq);


        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println("poll() "+adq);
        System.out.println(adq.poll());

        System.out.println("poll() pollFirst "+adq);
        System.out.println(adq.pollFirst());

        System.out.println("poll() pollLast "+adq);
        System.out.println(adq.pollLast());
    }
}