import java.util.*;

class Solution {
    static int getMaxSumHelper(Node node, Map<Node, Integer> map) {
        if (node == null)
            return 0;

        if (map.containsKey(node))
            return map.get(node);

        int sum = node.data;
        if (node.left != null)
            sum += getMaxSumHelper(node.left.left, map) + getMaxSumHelper(node.left.right, map);
        if (node.right != null)
            sum += getMaxSumHelper(node.right.left, map) + getMaxSumHelper(node.right.right, map);

        int result = Math.max(sum, getMaxSumHelper(node.left, map) + getMaxSumHelper(node.right, map));
        map.put(node, result);
        return result;
    }

    // Function to return the maximum sum of non-adjacent nodes.
    static int getMaxSum(Node root) {
        if (root == null)
            return 0;

        Map<Node, Integer> map = new HashMap<>();
        return Math.max(getMaxSumHelper(root, map), getMaxSumHelper(root.left, map) + getMaxSumHelper(root.right, map));
    }
}
