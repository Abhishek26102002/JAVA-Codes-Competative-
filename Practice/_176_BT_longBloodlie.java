class Solution {
    // This is HOw u can send by ref making global veriable;
    int maxLen = 0;
    int maxSum = 0;

    private void solve(Node root, int len, int sum) {

        if (root == null) {
            if (len > maxLen) {
                maxLen = len;
                maxSum = sum;
            } else if (len == maxLen) {
                maxSum = Math.max(sum, maxSum);
            }
            return;
        }

        sum += root.data;

        solve(root.left, len + 1, sum);
        solve(root.right, len + 1, sum);

    }

    public int sumOfLongRootToLeafPath(Node root) {

        solve(root, 0, 0);
        return maxSum;
    }	
}
