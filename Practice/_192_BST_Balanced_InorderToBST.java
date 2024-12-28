import java.util.ArrayList;

class GfG {
    void inOrder(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;

        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }

    Node inOrderToBST(ArrayList<Integer> arr, int start, int end) {
        if (start > end)
            return null;

        int mid = start + (end - start) / 2;
        Node root = new Node(arr.get(mid));

        root.left = inOrderToBST(arr, start, mid - 1);
        root.right = inOrderToBST(arr, mid + 1, end);

        return root;
    }

    Node buildBalancedTree(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root, arr);

        return inOrderToBST(arr, 0, arr.size() - 1);
    }

}
