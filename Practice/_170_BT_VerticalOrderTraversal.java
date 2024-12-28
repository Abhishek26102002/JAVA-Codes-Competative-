import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;


class Solution
{
     static class Pair { 
        Node node;
        int hd;

        Pair(int hd, Node node) {
            this.node = node;
            this.hd = hd;
        }
    }
    //Function to find the vertical order traversal of Binary Tree.
    static ArrayList <Integer> verticalOrder(Node root)
    {
        if (root == null)
            return new ArrayList<>();

        Queue<Pair> q = new LinkedList<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();

        q.add(new Pair(0, root));
        
        while (!q.isEmpty()) {
            Pair curr = q.poll();

            if (map.containsKey(curr.hd)) {
                map.get(curr.hd).add(curr.node.data);
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
