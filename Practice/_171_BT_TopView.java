import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

 class Pair { // pair of integer and node type
    Node node;
    int hd;// hd : horizontaldistance : -2 -1 0 1 2 [like that]

    Pair(int hd, Node node) {
        this.node = node;
        this.hd = hd;
    }
}

class _171_BT_TopView {

    static ArrayList<Integer> topView(Node root) {

        if (root == null)
            return new ArrayList<>();

        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();

        q.add(new Pair(0, root));

        while (!q.isEmpty()) {
            Pair curr = q.poll();

            if (map.containsKey(curr.hd)) {
              // Nothing todo
            } else {
                ArrayList<Integer> temp = new ArrayList<>();
                temp.add(curr.node.data);
                map.put(curr.hd, temp);
            }

            if (curr.node.left != null) {
                q.add(new Pair(curr.hd - 1, curr.node.left));
            }

            if (curr.node.right != null) {
                q.add(new Pair(curr.hd + 1, curr.node.right));
            }
        }

        ArrayList<Integer> result = new ArrayList<>();
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            result.addAll(entry.getValue());
        }
        return result;

    }

}
