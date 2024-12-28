import java.util.ArrayList;

class Solution {
    void inOrder(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;

        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }

    public Node flattenBST(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root, arr);

        Node link = new Node(arr.get(0));

        Node curr = link;

        for (int i = 1; i < arr.size(); i++) {
            Node temp = new Node(arr.get(i));
            curr.left = null;
            curr.right = temp;
            curr = temp;
        }

        // 3rd step
        curr.left = null;
        curr.right = null;

        return link;
    }
}

// Leetcode has some small diff in code
class Solution2 {
    void inOrder(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;

        arr.add(root.data);
        inOrder(root.left, arr);
        inOrder(root.right, arr);
    }

    public void flatten(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        inOrder(root, arr);

        Node curr = root;

        for (int i = 1; i < arr.size(); i++) {
            Node temp = new Node(arr.get(i));
            curr.left = null;
            curr.right = temp;
            curr = temp;
        }
    }
}