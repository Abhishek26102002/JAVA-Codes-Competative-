import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    void inOrder(TreeNode root, ArrayList<Integer> arr) {
        if (root == null)
            return;

        inOrder(root.left, arr);
        arr.add(root.val);
        inOrder(root.right, arr);
    }

    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    public List<Integer> merge(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> a1 = new ArrayList<>();
        inOrder(root1, a1);

        ArrayList<Integer> a2 = new ArrayList<>();
        inOrder(root2, a2);

        a2.addAll(a1);
        Collections.sort(a2);
        return a2;

    }
}
