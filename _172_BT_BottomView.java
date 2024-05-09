import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class _172_BT_BottomView {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Pair { // for assigning level to each node 
        Node node;
        int verticalLevel;

        Pair(Node node, int verticalLevel) {
            this.node = node;
            this.verticalLevel = verticalLevel;
        }
    }

    static ArrayList<Integer> BottomView(Node root) {

        Queue<Pair> queue = new LinkedList<>();
        HashMap<Integer, ArrayList<Integer>> verticalLevelMap = new HashMap<>();
        //      key     ,   Value



        queue.add(new Pair(root, 0)); // i know by default that root has Node=root.val || Level=0

        while (!queue.isEmpty()) {

            Pair pair = queue.remove();
            
            Node currentNode = pair.node; // root ka val
            int currentVerticalLevel = pair.verticalLevel; // root ka level

            if (verticalLevelMap.containsKey(currentVerticalLevel)) {
                ArrayList<Integer> nodeList = verticalLevelMap.get(currentVerticalLevel);
                nodeList.add(currentNode.data);
                verticalLevelMap.put(currentVerticalLevel, nodeList);
            } 
            
            else {
                ArrayList<Integer> nodeList = new ArrayList<>();
                nodeList.add(currentNode.data);
                verticalLevelMap.put(currentVerticalLevel, nodeList);
            }

            if (currentNode.left != null) {
                queue.add(new Pair(currentNode.left, currentVerticalLevel - 1));
            }

            if (currentNode.right != null) {
                queue.add(new Pair(currentNode.right, currentVerticalLevel + 1));
            }
        }

        int minVerticalLevel = 0, maxVerticalLevel = 0;

        for (int verticalLevel : verticalLevelMap.keySet()) {
            minVerticalLevel = Math.min(verticalLevel, minVerticalLevel);
        }

        for (int verticalLevel : verticalLevelMap.keySet()) {
            maxVerticalLevel = Math.max(verticalLevel, maxVerticalLevel);
        }

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = minVerticalLevel; i <= maxVerticalLevel; i++) {
            ArrayList<Integer> nodeList = verticalLevelMap.get(i);

            // Last ka val ko store kr lia and bas use hi print krwa die ans aa gya
            int last=0;
            if (nodeList != null) {
                for(int x:nodeList){
                    last=x;
                }
                result.add(last);
            }
        }

        return result;
    }
}

// Better

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
    //Function to return a list containing the bottom view of the given tree.
    public ArrayList <Integer> bottomView(Node root)
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
         	
           ArrayList<Integer> value = entry.getValue();
            // Check if the value is not empty before getting the last element
            if (!value.isEmpty()) {
                int lastElement = value.get(value.size() - 1);
                result.add(lastElement);
            }
         }
     
        return result;
    }
}
