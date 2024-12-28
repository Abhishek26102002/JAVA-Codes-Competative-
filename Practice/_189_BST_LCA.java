class Solution {
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if (root == null)
            return null;
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }
}

// Iterative method BUT TLE

class sol2 {
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val)
                root = root.left;
            else if (p.val > root.val && q.val > root.val)
                root = root.right;
        }
        return root;
    }
}