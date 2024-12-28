public class _119_LL_getStartofLoop {
    // ---Drivers Code Start---
    Node floyedDetectionloop(Node head) {

        if (head == null) {
            return null;
        }

        Node slow = head;
        Node fast = head;

        while (slow != null && fast != null) {
            fast = fast.next;
            if (fast != null) {
                fast = fast.next;
            }
            if (slow == fast) {
                return slow;
            }
            slow = slow.next;
        }
        return slow;
    }

    // ---Drivers Code End---

    Node getStartingNode(Node head) {

        if (head == null) {
            return null;
        }

        Node pointofIntersection = floyedDetectionloop(head);
        Node slow = head;

        while (slow != pointofIntersection) {
            slow = slow.next;
            pointofIntersection = pointofIntersection.next;
        }

        System.out.println("Loop start at Node :" + slow.data);
        return slow;
    }

}
