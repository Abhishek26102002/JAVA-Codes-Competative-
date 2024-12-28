import java.util.ArrayList;

class Solution {
    boolean helper(Node root, int min, int max) {
        if (root == null)
            return true;
        if (root.data <= min || root.data >= max)
            return false;

        return helper(root.left, min, root.data) && helper(root.right, root.data, max);
    }

    boolean isBST(Node root) {
        return helper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

}

class Solution2 {
    int min = Integer.MIN_VALUE;

    void Inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        Inorder(root.left, arr);
        arr.add(root.data);
        Inorder(root.right, arr);
    }

    // Function to check whether a Binary Tree is BST or not.
    boolean isBST(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Inorder(root, arr);

        for (int x : arr) {
            if (x <= min)
                return false;
            else {
                min = x;
            }
        }
        return true;

    }
}