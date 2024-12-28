class pair {
    int height = 0;
    int diameter = 0;

    pair(int height, Node root) {
        this.height = height;
        this.diameter = root;
    }
}

class Solution1 {

    int diameter(Node root) {
        pair p = DiameterFast(root);
        return p.diameter;
    }

    public static pair DiameterFast(Node root) {
        if (root == null) {
            int height = 0;
            int diameter = 0;
            pair ans = new pair(height, diameter);
            return ans;
        }
        pair left = DiameterFast(root.left);
        pair right = DiameterFast(root.right);

        int op1 = left.diameter;
        int op2 = right.diameter;
        int op3 = 1 + left.height + right.height;

        int diameter = Math.max(op1, Math.max(op2, op3));
        int height = 1 + Math.max(left.height, right.height);

        pair ans = new pair(height, diameter);
        return ans;
    }
}

// Method 2
class Solution2 {

    int ans = 0;

    int diameter(Node root) {
        height(root);
        return ans;
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        ans = Math.max(ans, left + right + 1);

        return 1 + Math.max(left, right); // height of binary tree
    }
}

// Method 3 Complexity O(n^2)
class Solution3 {
    int height(Node node) {
        if (node == null) {
            return 0;
        }
        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }

    public int diameterOfBinaryTree(Node root) {
        if (root == null) {
            return 0;
        }

        int op1 = diameterOfBinaryTree(root.left);
        int op2 = diameterOfBinaryTree(root.right);
        int op3 = height(root.left) + height(root.right);

        return (Math.max(op1, Math.max(op2, op3)));
    }
}