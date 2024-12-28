import java.util.*;

class Node {
    Node left;
    Node right;
    int data;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class temp {
    static Scanner sc = null;

    public static void main(String args[]) {

        sc = new Scanner(System.in);

        createTree();
    }

    static Node createTree() {

        Node root = null;

        System.out.println("Enter the data");
        int data = sc.nextInt();

        if (data == -1) {
            return null;
        }

        root = new Node(data);

        System.out.println("Enter Data left of " + data);
        root.left = createTree();

        System.out.println("Enter Data right of " + data);
        root.right = createTree();

        return root;
    }

    void inOrder(Node root) { // LNR
        if (root == null)
            return;

        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }

    void preOrder(Node root) { // PreOrder : NLR
        if (root == null)
            return;

        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }

    void postOrder(Node root) { // PostOrder : LRN
        if (root == null)
            return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data);
    }

    int height(Node root) {
        if (root == null)
            return 0;

        return Math.max(height(root.left), height(root.right)) + 1;
    }

    int size(Node root) { // Size of binary tree means how many nodes are present in the tree

        if (root == null)
            return 0;

        return size(root.left) + size(root.right) + 1;// 1 for root itself

    }

    int max(Node root) {
        if (root == null)
            return Integer.MIN_VALUE;

        return Math.max(root.data, Math.max(max(root.left), max(root.right)));
    }

    int min(Node root) {
        if (root == null)
            return Integer.MAX_VALUE;

        return Math.min(root.data, Math.min(min(root.left), min(root.right)));
    }

    // display Level Order Traversal
    // This will give ans in linear structure eg.[4.2.6.9.4.1]
    // in java we cannot add null to Node so another trick in _161_BT_LLB.java
    void LevelOrderTraversal(Node root) {
        Queue<Node> q = new ArrayDeque<>();

        q.add(root);

        while (!q.isEmpty()) {
            Node currentPosition = q.poll();

            System.out.println(currentPosition.data);

            if (currentPosition.left != null)
                q.add(currentPosition.left);
            if (currentPosition.right != null)
                q.add(currentPosition.right);

        }
    }

    // Left view of the tree is print only leftmost node
    // left view of the tree is print only rightmost node
    // Display
    public void leftView(Node root) {
        ArrayList<Node> list = new ArrayList<>();
        solveForLeftView(root, list, 0);

        // Print the left view
        for (Node node : list) {
            System.out.print(node.data + " ");
        }
    }

    private void solveForLeftView(Node root, ArrayList<Node> list, int level) {
        if (root == null)
            return;

        // Add the first node of each level
        if (level == list.size()) {
            list.add(root);
        }

        // Traverse the left subtree before the right subtree
        solveForLeftView(root.left, list, level + 1);
        solveForLeftView(root.right, list, level + 1);
    }

    static class Pair {
        Node node;
        int hd; // Horizontal distance

        Pair(int hd, Node node) {
            this.node = node;
            this.hd = hd;
        }
    }

    // Top View of Tree is only node that visible from top
    static ArrayList<Integer> topview(Node root) {
        if (root == null)
            return new ArrayList<>();

        Queue<Pair> q = new ArrayDeque<>();
        Map<Integer, ArrayList<Integer>> map = new TreeMap<>();

        q.add(new Pair(0, root));

        while (!q.isEmpty()) {
            Pair curr = q.poll();

            if (map.containsKey(curr.hd)) {
                // Nothing To DO
            } else {
                // if we left only else part remove i condition then it will become bottom view
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

    Node prev = null;
    Node head = null;

    Node convertToDLL(Node root) {
        if (root == null)
            return null;

        convertToDLL(root.left);
        if (prev == null) {
            head = root;
        } else {
            root.left = prev;
            prev.right = root;
        }
        // prev ko aage badha die(draw kro samaj jaoge)
        prev = root;
        convertToDLL(root.right);

        return head;
    }

    // diameter of a tree is the longest distace b/w the two leaf nodes
    // Complexity is O(n^2)
    int diameter(Node root) {

        if (root == null)
            return 0;

        int dl = diameter(root.left);
        int dr = diameter(root.right);

        int curr = height(root.left) + height(root.right) + 1;

        return Math.max(curr, Math.max(dl, dr));
    }


    // Not Working 
    int ans = 0;

    int diameter02(Node root) {
        if (root == null)
            return 0;

        int lh = diameter02(root.left);
        int rh = diameter02(root.right);

        ans = Math.max(ans, lh + rh + 1);

        return 1 + Math.max(lh, rh);
    }
    // Diameter02 Complexity O(n)

    // Least Common ancestor is Immidiate Parent
    public Node lowestCommonAncestor(Node root, Node p, Node q) {
        if(root == null ||root == p|| root == q) return root;

        Node left=lowestCommonAncestor(root.left,p,q);
        Node right =lowestCommonAncestor(root.right,p,q);

        if(left==null) return right;
        if(right==null) return left;

        return root;
    }

    

    // end of tree
}