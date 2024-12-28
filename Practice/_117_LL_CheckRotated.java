public class _117_LL_CheckRotated {

    boolean isCircular(Node head)
    {
        if (head == null) {
            return true;
        }
	  Node curr = head.next;
        while (curr != null && curr != head) {
            curr=curr.next;
        }

        if (curr == head) {
        return true;
        }
        return false;

    }
}
