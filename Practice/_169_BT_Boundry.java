import java.util.ArrayList;
import java.util.Collections;



public class _169_BT_Boundry {

    void traverseLeft(Node root, ArrayList<Integer> ans) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }

        ans.add(root.data);

        if (root.left != null) {
            traverseLeft(root.left, ans);
        } else {
            traverseLeft(root.right, ans);
        }
    }

    void traverseLeaf(Node root, ArrayList<Integer> ans) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            ans.add(root.data);
            return;
        }

        traverseLeaf(root.left, ans);
        traverseLeaf(root.right, ans);
    }

    void traverseRight(Node root, ArrayList<Integer> ans) {
        if (root == null || (root.left == null && root.right == null)) {
            return;
        }

        if (root.right != null) {
            traverseRight(root.right, ans);
        } else {
            traverseRight(root.left, ans);
        }

        ans.add(root.data);
    }

    ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (node == null) {
            return ans;
        }

        ans.add(node.data);

        // Traverse left boundary, excluding the root if it's also a leaf
        traverseLeft(node.left, ans);

        // Traverse leaves, excluding the root if it's also a leaf
        traverseLeaf(node.left, ans);
        traverseLeaf(node.right, ans);

        // Traverse right boundary, excluding the root if it's also a leaf
        traverseRight(node.right, ans);

        return ans;
    }
}
