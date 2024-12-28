import java.util.*;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class _161_BT_LBB {
    public static void main(String[] args) {

        BT b = new BT();
        // Node root = b.BuildTree(null);
        // input :1 3 7 -1 -1 11 -1 -1 5 17 -1 -1 -1

        Node root = b.buildFromLevelOrder(null);
        // input : 1 3 5 7 11 17 -1 -1 -1 -1 -1 -1 -1

        // b.display(root);
        b.displayrev(root);

        // System.out.println("Inorder With rec");
        // b.inOrder(root);

        // System.out.println("Inorder Without REc");
        // b.inorderWR(root);

        // System.out.println("PostOrder");
        // b.postOrder(root);

        // System.out.println("PostOrder Without Recursion");
        // b.postOrderWR(root);
    }
}

class BT {

    // Build tree Method 01 in LNR

    Node BuildTree(Node root) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data :");
        int data = scanner.nextInt();

        root = new Node(data);

        if (data == -1) {
            return null;

        }

        System.out.println("Enter data for inserting in left of " + root.data);
        root.left = BuildTree(root.left);

        System.out.println("Enter data for inserting in right of " + root.data);
        root.right = BuildTree(root.right);

        return root;
    }

    // Build tree Method 02 NLR

    Node buildFromLevelOrder(Node root) {
        Queue<Node> q = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Root :");
        int data = scanner.nextInt();
        root = new Node(data);

        q.add(root);

        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.poll();

            System.out.println("Enter Left Node for " + temp.data + " : ");
            int leftData = scanner.nextInt();

            if (leftData != -1) {
                temp.left = new Node(leftData); // create Node left of root/ temp ka left
                q.add(temp.left);
            }

            System.out.println("Enter right Node for " + temp.data + " : ");
            int rightData = scanner.nextInt();

            if (rightData != -1) {
                temp.right = new Node(rightData);// create Node right of root/ temp ka right
                q.add(temp.right);
            }

        }
        return root;

    }

    // levelOrderTraversal -- Display

    void display(Node root) {
        Deque<Node> q = new ArrayDeque<>();
        if (root == null)
            return;

        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                Node temp = q.poll();

                System.out.print(temp.data + " ");

                if (temp.left != null) {
                    q.add(temp.left);
                }
                if (temp.right != null) {
                    q.add(temp.right);
                }
            }

            System.out.println(); // Move to the next level
        }
    }

    // Display -- Reverse Order Traversal

    void displayrev(Node root) {
        Deque<Node> q = new ArrayDeque<>();
        Stack<Node> s = new Stack<>();
        if (root == null) {
            return;
        }

        q.add(root);

        while (!q.isEmpty()) {

            Node temp = q.poll();
            s.push(temp);

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }

        }
        while (!s.empty()) {
            // Node temp = s.peek();
            // System.out.print(temp.data + " ");
            System.out.print(s.pop().data + " ");
            // s.pop();
        }
    }
    // ----------------------------------

    void inOrder(Node root) { // LNR
        if (root == null)
            return;

        inOrder(root.left);
        System.out.println(root.data + " ");
        inOrder(root.right);

    }

    void inorderWR(Node root) { // LNR without recursion
        if (root == null)
            return;

        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        while (curr != null || s.size() > 0) {

            while (curr != null) {
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            System.out.print(curr.data + " ");
            curr = curr.right;
        }
    }

    void preOrder(Node root) { // NLR
        if (root == null) {
            return;
        }
        System.out.println(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    void preOrderWR(Node root) { // NLR without recursion
        if (root == null) {
            return;
        }

        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        while (curr != null || s.size() > 0) {

            while (curr != null) {
                System.out.print(curr.data + " ");
                s.push(curr);
                curr = curr.left;
            }
            curr = s.pop();
            curr = curr.right;
        }
    }

    void postOrder(Node root) { // LRN
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.data + " ");

    }

    void postOrderWR(Node root) { // LRN without recursion
        if (root == null) {
            return;
        }

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        stack1.push(root);

        while (!stack1.isEmpty()) {
            Node curr = stack1.pop();
            stack2.push(curr);

            if (curr.left != null) {
                stack1.push(curr.left);
            }
            if (curr.right != null) {
                stack1.push(curr.right);
            }
        }

        // Print the nodes in post-order
        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop().data + " ");
        }
    }

}
