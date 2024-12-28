class Solution1 {
    int i = 0;

    Node solve(int[] preorder, int min, int max) {
        if (i >= preorder.length)
            return null;

        if (preorder[i] < min || preorder[i] > max)
            return null;

        Node root = new Node(preorder[i++]);

        root.left = solve(preorder, min, root.data);
        root.right = solve(preorder, root.data, max);

        return root;

    }

    public Node bstFromPreorder(int[] preorder) {
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        return solve(preorder, min, max);

    }
}
// More Optimised
class Solution {
    private int index = 0;

    private Node buildBSTFromPreorder(int[] preorder, int bound) {
        // Base case: If all elements are processed or the next element is out of the
        // current bound.
        if (index == preorder.length || preorder[index] > bound) {
            return null;
        }

        // The element fits in the bound, so create a new node.
        int data = preorder[index++];
        Node node = new Node(data);

        // All elements in the left subtree must be less than the node value.
        node.left = buildBSTFromPreorder(preorder, data);

        // All elements in the right subtree must be less than the upper bound.
        node.right = buildBSTFromPreorder(preorder, bound);

        return node;
    }

    public Node bstFromPreorder(int[] preorder) {
        return buildBSTFromPreorder(preorder, Integer.MAX_VALUE);
    }
}
