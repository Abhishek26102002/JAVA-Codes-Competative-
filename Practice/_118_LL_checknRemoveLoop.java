import java.util.HashMap;
import java.util.Map;

public class _118_LL_checknRemoveLoop {
    //time = O(n) space = O(n)
    boolean detectloop(Node head) {

        if (head == null) {
            return false;
        }
        Map<Node, Boolean> map1 = new HashMap<>();

        Node temp = head;

        while (temp != null) {
            if (map1.containsKey(temp) == true) {
                System.out.println("loop present at ele :" + map1.get(temp));
                return true;
            }
            map1.put(temp, true);
            temp = temp.next;
        }

        return false;
    }

    // -----------------------------------------------------
     //time = O(n) space = O(1)
    //less time and less space
    boolean floyedDetectionloop(Node head) {

        if (head == null) {
            return false;
        }

        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
        }

        return false;
    }
    // -----------------------------------------
}
