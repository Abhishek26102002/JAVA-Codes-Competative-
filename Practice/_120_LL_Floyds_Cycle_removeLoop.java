public class _120_LL_Floyds_Cycle_removeLoop {
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

    
    Node getStartingNode(Node head) {

        if (head == null) {
            return null;
        }

        Node pointofIntersection = floyedDetectionloop(head);

        if(pointofIntersection==null){
            return null;
        }

        Node slow = head;

        while (slow != pointofIntersection) {
            slow = slow.next;
            pointofIntersection = pointofIntersection.next;
        }

        // System.out.println("Loop start at Node :" + slow.data);
        return slow;
    }
    // ---Drivers Code End---



    void removeloop(Node head){

        if(head==null){
            return;
        }
        Node startOfLoop=getStartingNode(head);

        if(startOfLoop==null){
            return; // return head;
        }

        Node temp=startOfLoop;
        while(temp.next!=startOfLoop){
            temp=temp.next;
        }
        temp.next=null;

    }
    
}
