public class _196_BST_MergTwoSortedLL {
    Node mergTwoSortedLL(Node head1, Node head2) {

        Node head = null;
        Node tail = null;

        while (head1 != null && head2 != null) {
            if (head1.data > head2.data) {

                if (head == null) {
                    head = head1;
                    tail = head1;
                    head1 = head1.right;
                } else {
                    tail.right = head1;
                    head1.left = tail;
                    tail = head1;
                    head1 = head1.right;

                }
            } else {

                if (head == null) {
                    head = head2;
                    tail = head2;
                    head2 = head2.right;
                } else {
                    tail.right = head2;
                    head2.left = tail;
                    tail = head2;
                    head2 = head2.right;
                }
            }
        }
        while (head1.right != null) {
            tail.right = head1;
            head1.left = tail;
            tail = head1;
            head1 = head1.right;
        }
        while (head2.right != null) {
            tail.right = head2;
            head2.left = tail;
            tail = head2;
            head2 = head2.right;
        }

        return head;
    }

}
