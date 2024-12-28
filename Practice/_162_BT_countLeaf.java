
class Tree {
    int count = 0;

    int countLeaves(Node node) {

        if (node == null) {
            return 0;
        }
        countLeaves(node.left);
        countLeaves(node.right);
        if (node.left == null && node.right == null) {
            count++;
        }
        return count;
    }
}