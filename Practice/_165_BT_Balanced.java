// A binary tree node class
class Node {
    int data;
    Node left, right;

    Node(int d) {
        data = d;
        left = right = null;
    }
}
// ---------------------------------- METHOD 1--------------------------------

class Tree1 {
    int height(Node node) {
        // code here
        if (node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        return (Math.max(left, right) + 1);
    }

    boolean isBalanced(Node root) {
        if (root == null) {
            return true;
        }

        boolean left = isBalanced(root.left);
        boolean right = isBalanced(root.right);
        boolean diff = Math.abs(height(root.left) - height(root.right)) <= 1;

        return left && right && diff;

    }
} 
// ---------------------------------- METHOD 2--------------------------------

class Tree2 {
    class Pair {
        boolean balance;
        int height;

        Pair(boolean balance, int height) {
            this.balance = balance;
            this.height = height;
        }
    }

    Pair isBalancedFast(Node root) {
        if (root == null) {
            int height = 0;
            boolean balance = true;
            Pair p = new Pair(balance, height);
            return p;
        }

        Pair left = isBalancedFast(root.left);
        Pair right = isBalancedFast(root.right);

        boolean leftans = left.balance;
        boolean rightans = right.balance;

        boolean diff = Math.abs(left.height - right.height) <= 1;

        Pair ans = new Pair(false, 1 + Math.max(left.height, right.height));
        ans.balance = leftans && rightans && diff;

        return ans;

    }

    boolean isBalanced(Node root) {
        Pair p = isBalancedFast(root);
        return p.balance;
    }
}

// ---------------------------------- METHOD 3--------------------------------
class Tree {
    boolean isBalanced(Node root) {
        if (root == null)
            return true;

        int left = height(root.left);
        int right = height(root.right);
        int diff = Math.abs(left - right);
        if (diff > 1)
            return false;
        boolean leftAns = isBalanced(root.left);
        boolean rightAns = isBalanced(root.right);

        return leftAns && rightAns;

    }

    int height(Node node) {
        if (node == null)
            return 0;

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }
}
