import java.util.ArrayList;

class Solution {
    void Inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;
        }
        Inorder(root.left, arr);
        arr.add(root.data);
        Inorder(root.right, arr);
    }

    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int K) {
        ArrayList<Integer> arr = new ArrayList<>();
        Inorder(root, arr);
        int n = arr.size();
        if (K <= n) {
            return arr.get(K - 1);
        }
        return -1;
    }
}

// Method 2
class Solution2 {
    int i = 0;

    int solve(Node root, int K) {
        if (root == null) {
            return -1;
        }
        // left ka call
        int left = solve(root.left, K);
        if (left != -1) {
            return left;
        }
        i++;
        if (i == K) { // for Kth largest =n-K+1 th smallest
            return root.data;
        }
        return solve(root.right, K);

    }

    // Return the Kth smallest element in the given BST
    public int KthSmallestElement(Node root, int K) {
        return solve(root, K);
    }
}
