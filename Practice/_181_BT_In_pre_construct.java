import java.util.HashMap;
import java.util.Map;


// Runned
class Solution3 {
    static int Find(int in[], int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (in[i] == target)
                return i;
        }
        return -1;
    }

    static Node Tree(int in[], int pre[], int InStart, int InEnd, int[] index) {
        // base
        if (InStart > InEnd){
            return null;
        }

        Node root = new Node(pre[index[0]]);

        index[0]++;

        int post = Find(in, root.data, InStart, InEnd);

        // left
        root.left = Tree(in, pre, InStart, post - 1, index);
        // right
        root.right = Tree(in, pre, post + 1, InEnd, index);

        return root;
    }

    public static Node buildTree(int inorder[], int preorder[], int n) {
        int[] index = new int[1]; // sending by ref
        index[0] = 0;
        return Tree(inorder, preorder, 0, n - 1, index);
    }
}

// ---------------------------------TLE
class Solution {
    static int preOrderIndex = 0;

    static int findPos(int[] in, int ele, int n) {
        for (int i = 0; i < n; i++) {
            if (in[i] == ele)
                return i;
        }
        return -1;
    }

    static Node solve(int[] in, int[] pre, int preOrderIndex, int inorderStart, int inOrderEnd, int n) {
        // base
        if (preOrderIndex >= n || inorderStart > inOrderEnd)
            return null;

        int ele = pre[preOrderIndex++];
        Node root = new Node(ele);
        int position = findPos(in, ele, n);

        root.left = solve(in, pre, preOrderIndex, inorderStart, position - 1, n);
        root.right = solve(in, pre, preOrderIndex, position + 1, inOrderEnd, n);

        return root;

    }

    public static Node buildTree(int inorder[], int preorder[], int n) {
        Node ans = solve(inorder, preorder, preOrderIndex, 0, n - 1, n);
        return ans;
    }
}

// Using Mapping ---------------------------------TLE
class Solution2 {
    static int preOrderIndex = 0;

    static void findPos(int[] in, int n, Map<Integer, Integer> NodetoIndex) {
        for (int i = 0; i < n; i++) {
            NodetoIndex.put(in[i], i);
            // key , value
        }
    }

    static Node solve(int[] in, int[] pre, int preOrderIndex, int inorderStart, int inOrderEnd, int n,
            Map<Integer, Integer> NodetoIndex) {
        // base
        if (preOrderIndex >= n || inorderStart > inOrderEnd)
            return null;

        int ele = pre[preOrderIndex++];
        Node root = new Node(ele);
        int position = NodetoIndex.get(ele);

        // recv calls
        root.left = solve(in, pre, preOrderIndex, inorderStart, position - 1, n, NodetoIndex);
        root.right = solve(in, pre, preOrderIndex, position + 1, inOrderEnd, n, NodetoIndex);

        return root;

    }

    public static Node buildTree(int inorder[], int preorder[], int n) {
        // creat a map to index and ele of Inorder
        Map<Integer, Integer> NodetoIndex = new HashMap<>();
        findPos(inorder, n, NodetoIndex);
        Node ans = solve(inorder, preorder, preOrderIndex, 0, n - 1, n, NodetoIndex);
        return ans;
    }
}
