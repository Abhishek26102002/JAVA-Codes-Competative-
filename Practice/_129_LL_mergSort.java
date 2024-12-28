public class _129_LL_mergSort {
    static Node findmid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    static Node merg(Node left, Node right) {
        Node ans = new Node(-1);
        Node temp = ans;
    
        while (left != null && right != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next; // Move temp to the next node of the merged list
        }
    
        // If any list is not fully processed, append its remaining nodes
        if (left != null)
            temp.next = left;
        else if (right != null)
            temp.next = right;
    
        return ans.next;
    }
    

    static Node mergeSort(Node head) {
        // base case
        if (head == null || head.next == null) {
            return head;
        }

        // step 1: breaks the LL into two halves;

        Node mid = findmid(head);
        Node left = head;
        Node right = mid.next;
        mid.next = null;

        // Step 2: perform mergSort in two halves

        left = mergeSort(left);
        right = mergeSort(right);

        // step 3: merg into one and return the ans.
        Node result = merg(left, right);

        return result;
    }

}
