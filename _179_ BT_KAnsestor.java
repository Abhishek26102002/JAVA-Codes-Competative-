import java.util.ArrayList;

class Solution {
    int ans;

    public void solve(Node root, int k, int node, ArrayList<Integer> a) {
        if (root == null)
            return;

        if (root.data == node) {
            ans = a.size() >= k ? a.get(a.size() - k) : -1;
        }
        a.add(root.data);

        solve(root.left, k, node, a);
        solve(root.right, k, node, a);
        
        a.remove(a.size() - 1);
    }

    public int kthAncestor(Node root, int k, int node) {
        solve(root, k, node, new ArrayList<>());
        return ans;
    }
}
