import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

class Node {
    int data;
    Node left = null, right = null;

    Node(int data) {
        this.data = data;
    }
}

public class _175_BT_DiagonalView {

    public ArrayList<Integer> diagonal(Node root) {

        ArrayList<Integer> ans = new ArrayList<>();

        if (root == null){
            return ans;
        }

        Queue<Node> q = new LinkedList<>();root

        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();
            while (curr != null) {
                if (curr.left != null){
                    q.add(curr.left);
                }
                ans.add(curr.data);
                curr = curr.right;
            }
        }
        return ans;
    }

}
// ANS :  8 10 14 3 6 7 13 1 4

//-----------------------------------------------------------------------------------------------------------------------------
class Tree{ 
	void solve(Node root, int hd, Map<Integer, List<Integer>> mp) {
        if (root == null) return;
        if (!mp.containsKey(hd)){
            mp.put(hd, new ArrayList<>());
	}        
        mp.get(hd).add(root.data);
        solve(root.left, hd + 1, mp);
        solve(root.right, hd, mp);
    }
     public ArrayList<Integer> diagonal(Node root)
      {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;
        Map<Integer, List<Integer>> mp = new HashMap<>();
        solve(root, 0, mp);
        for (List<Integer> list : mp.values()) {
            ans.addAll(list);
        }
        return ans;
      }
}
