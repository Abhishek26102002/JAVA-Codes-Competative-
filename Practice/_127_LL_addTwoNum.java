class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}
//----------------------- Expected Time Complexity: O(N+M)
//----------------------- Expected Auxiliary Space: O(Max(N,M)) for the resultant list.
public class _127_LL_addTwoNum {
    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node after = null;

        while (curr != null) {
            after = curr.next;
            curr.next = prev;

            prev = curr;
            curr = after;
        }
        return prev;
    }

    static Node insertAtTail(Node ansHead, Node ansTail, int val) {
        Node temp = new Node(val);

        // When the list is empty
        if (ansHead == null) {
            ansHead = temp;
            ansTail = temp;

        }
        // When The list is not empty
        else {
            ansTail.next = temp;
            ansTail = temp;

        }
        return ansTail;
    }

    static Node add(Node first, Node second) {

        int carry = 0;
        Node ansHead = null;
        Node ansTail = null;

        while (first != null || second != null || carry > 0) {
            int firstVal = (first != null) ? first.data : 0;
            int secondVal = (second != null) ? second.data : 0;
            // 1. If the condition (first != null) is true, then the expression before the
            // colon : is evaluated, which is first.data.
            // 2.  If the condition (first != null) is false, then the expression
            // after the colon : is evaluated, which is 0.
            int sum = carry + firstVal + secondVal;
            carry = sum / 10;
            int digit = sum % 10;
            Node newNode = new Node(digit);

            if (ansHead == null) {
                ansHead = newNode;
                ansTail = newNode;
            } else {
                ansTail.next = newNode;
                ansTail = newNode;
            }

            if (first != null)
                first = first.next;
            if (second != null)
                second = second.next;
        }

        return ansHead;
    }

    static Node addTwoLists(Node first, Node second) {

        first = reverse(first);
        second = reverse(second);

        Node ans = add(first, second);

        return reverse(ans);
    }

}

// ---------------------------------- CHat GPT------------------------------
// method 2 writing while loop


    static Node add2(Node first, Node second) {
        int carry = 0;
        Node ansHead = null;
        Node ansTail = null;

        while (first != null || second != null || carry != 0) {
            int sum = carry;
            if (first != null) {
                sum += first.data;
                first = first.next;
            }
            if (second != null) {
                sum += second.data;
                second = second.next;
            }
            int digit = sum % 10;
            carry = sum / 10;
            ansTail = insertAtTail(ansHead, ansTail, digit);
            if (ansHead == null) {
                ansHead = ansTail;
            }
        }
        return ansHead;
    }
