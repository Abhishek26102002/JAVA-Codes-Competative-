// Recursive Method
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
}

class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null)
            return null;

        if (val == root.val) {
            return root;
        }
        if (val < root.val) {
            return searchBST(root.left, val);
        }
        if (val > root.val) {
            return searchBST(root.right, val);
        }
        return null;
    }
}

// Iterative Method

class Solution2 {
    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null)
            return null;
        while (root != null && root.val != val) {
            root = val < root.val ? root.left : root.right;

        }
        return root;
    }
}