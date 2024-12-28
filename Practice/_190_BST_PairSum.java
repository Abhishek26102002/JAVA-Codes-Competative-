import java.util.ArrayList;

class Solution {
    // root : the root Node of the given BST
    // target : the target sum
    void Inorder(Node root, ArrayList<Integer> arr) {
        if (root == null) {
            return;

        }
        Inorder(root.left, arr);
        arr.add(root.data);
        Inorder(root.right, arr);
    }

    public int isPairPresent(Node root, int target) {
        ArrayList<Integer> arr = new ArrayList<>();
        Inorder(root, arr);
        int s = 0;
        int e = arr.size() - 1;
        while (s < e) {
            int sum = arr.get(s) + arr.get(e);
            if (sum == target)
                return 1;
            if (target > sum)
                s++;
            if (target < sum)
                e--;
        }
        return 0;
    }
}
