import java.util.ArrayList;
import java.util.Collections;

class Solution {
    static void inOrder(Node root, ArrayList<Integer> arr) {
        if (root == null)
            return;

        inOrder(root.left, arr);
        arr.add(root.data);
        inOrder(root.right, arr);
    }

    // Return the size of the largest sub-tree which is also a BST
    static int largestBst(Node root) {
        int cnt = 0;
        ArrayList<Integer> a1 = new ArrayList<>();
        inOrder(root, a1);

        ArrayList<Integer> a2 = new ArrayList<>();
        a2.addAll(a1);
        Collections.sort(a2);

        for (int i = 0; i < a2.size(); i++) {
            if (a1.get(i) == a2.get(i))
                cnt++;
        }

        return cnt;
    }

}