class Solution {
    class Pair {
        boolean isSumTree;
        int data;

        Pair(boolean isSumTree, int data) {
            this.isSumTree = isSumTree;
            this.data = data;
        }
    }

    Pair isSumFast(Node root) {

        if (root == null) {
            Pair ans = new Pair(true, 0);
            return ans;
        }
        if (root.right == null && root.left == null) {
            Pair ans = new Pair(true, root.data);
            return ans;
        }

        Pair leftAns = isSumFast(root.left);
        Pair rightAns = isSumFast(root.right);

        boolean isLeftSumTree = leftAns.isSumTree;
        boolean isRightSumTree = rightAns.isSumTree;

        int leftSum = leftAns.data;
        int rightSum = rightAns.data;

        boolean condi = root.data == leftSum + rightSum;

        Pair ans = new Pair(isLeftSumTree && isRightSumTree && condi, root.data + leftSum + rightSum);

        return ans;
    }

    boolean isSumTree(Node root) {

        return isSumFast(root).isSumTree;
    }
}
