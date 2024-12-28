import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;

class GFG1 {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> result = new ArrayList<>();

        if (root == null)
            return result;
        Deque<Node> q = new ArrayDeque<>();
        q.add(root);

        boolean LeftToRight = true;

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> ans = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                ans.add(temp.data);

                if (temp.left != null)
                    q.add(temp.left);
                if (temp.right != null)
                    q.add(temp.right);
            }

            if (LeftToRight == false) {
                Collections.reverse(ans);
            }
            result.addAll(ans);
            LeftToRight = !LeftToRight; 
        }
        return result;
    }
}