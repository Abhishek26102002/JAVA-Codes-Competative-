public class _130_LL_flattenLL { 


    //-------------------------------wrong---------------------------------

    Node flatten(Node root) {
        /// base case
        if (root == null || root.next == null) {
            return root;
        }

        Node temp = root;
        Node ans=null;
        while (temp != null) {
            ans = merg(root, root.next);
            temp = temp.next;
            root = root.bottom;
            root = temp;
            root.next = null;
        }

        return ans;
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
            temp = temp.next;
        }

        if (left != null)
            temp.next = left;
        else if (right != null)
            temp.next = right;

        return ans.next;
    }

}
