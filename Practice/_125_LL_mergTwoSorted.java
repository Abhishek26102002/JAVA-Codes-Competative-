public class _125_LL_mergTwoSorted {

    Node solve(Node first, Node second) {

        //if first list has only one Node then , point it to second n return entire second list
        if (first.next == null) {
            first.next = second;
            return first;
        }

        Node prev = first;
        Node after = prev.next;
        Node middle = second;
        Node middlenext = middle.next;

        while (after != null && middle != null) {
            if ((middle.data >= prev.data) && (middle.data <= after.data)) {
                // add Node in middle
                prev.next = middle;
                middlenext = middle.next;
                middle.next = after;
                // update pointers
                prev = middle;
                middle = middlenext;
            } else {
                // window aage badha do
                prev = after;
                after = after.next;

                if (after == null) {

                    prev.next = middle;
                    return first;
                }

            }
        }

        return first;

    }

    //-----------------or for merge----------------------------
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
    

    Node sortedMerge(Node head1, Node head2) {

        if (head1 == null) {
            return head2;
        }
        if (head2 == null) {
            return head1;
        }

        if (head1.data <= head2.data) {
            return solve(head1, head2);
        } else {
            return solve(head2, head1);
        }
    }
}
