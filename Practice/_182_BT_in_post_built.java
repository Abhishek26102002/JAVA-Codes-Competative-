class GfG {
    static int Find(int in[], int target, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (in[i] == target)
                return i;
        }
        return -1;
    }

    static Node Tree(int in[], int post[], int InStart, int InEnd, int[] index) {
        if (InStart > InEnd)
            return null;

        Node root = new Node(post[index[0]]);
        index[0]--;

        int position = Find(in, root.data, InStart, InEnd);

        // in case of post order and inorder we dealth with right side first coz in post order LNR from back R(right) came first
        // right
        root.right = Tree(in, post, position + 1, InEnd, index);

        // left
        root.left = Tree(in, post, InStart, position - 1, index);

        return root;
    }

    // Function to return a tree created from postorder and inoreder traversals.
    Node buildTree(int in[], int post[], int n) {
        // Your code here
        int[] index = new int[1]; // sending by ref
        index[0] = n - 1;
        return Tree(in, post, 0, n - 1, index);
    }
}
