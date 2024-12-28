import java.util.ArrayDeque;
import java.util.Deque;

class Solution
{
      Node lca(Node root, int n1, int n2) {
        if (root == null) {
            return null;
        }

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        Node leftSide = lca(root.left, n1, n2);
        Node rightSide = lca(root.right, n1, n2);

        if (leftSide != null && rightSide != null) {
            return root;
        }
  
         else if (leftSide != null) {
            return leftSide;
        } else {
            return rightSide;
        }
        
        // or
        // Otherwise check if left subtree or right subtree
        // is LCA
        // return (leftSide != null) ? leftSide : rightSide;
    }

}

