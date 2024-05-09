import java.util.ArrayList;

class Solution {
    int cnt = 0;

    void solve(Node root, int k, ArrayList<Integer> q) {

        if (root == null) {
            return;
        }
        q.add(root.data);
        int total = 0;

        for (int i = q.size() - 1; i >= 0; i--) {
            total += q.get(i);
            if (total == k) {
                cnt++;
            }
        }

        solve(root.left, k, q);
        solve(root.right, k, q);

        q.remove(q.size() - 1);
    }

    public int sumK(Node root, int k) {
        if (root == null) {
            return 0;
        }
        ArrayList<Integer> q = new ArrayList<>();
        solve(root, k, q);
        return cnt;
    }
}
