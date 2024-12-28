public class _195_BST_toDLL {
    void ConvertIntoSortedDLL(Node root, Node head) {
        if (root == null){
            return;
        }

        ConvertIntoSortedDLL(root.right, head);
        root.right = head;
        if (root.left != null) {
            head.left = root;

        }
        ConvertIntoSortedDLL(root.left, head);
    }

}
