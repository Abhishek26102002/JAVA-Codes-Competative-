import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

class Node {

    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }

    Node() {
    }

}

class BST {
    Node insertIntoBST(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data) {
            // left
            root.left = insertIntoBST(root.left, data);
        }
        if (data > root.data) {
            // left
            root.right = insertIntoBST(root.right, data);
        }

        return root;

    }

    Node takeInout(Node root) {
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        while (data != -1) {
            root = insertIntoBST(root, data);
            data = sc.nextInt();
        }

        return root;
    }

    void display(Node root) {
        Deque<Node> q = new ArrayDeque<>();
        if (root == null) {
            return;
        }

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

    void inOrder(Node root) { // LNR
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);

    }

    void preOrder(Node root) { // NLR
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);

    }

    void postOrder(Node root) { // LRN
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }

    Node minVal(Node root) {
        Node temp = root;

        while (temp.left != null) {
            temp = temp.left;
        }

        return temp;
    }

    Node maxVal(Node root) {
        Node temp = root;

        while (temp.right != null) {
            temp = temp.right;
        }

        return temp;
    }

    void morrisInorderTraversal(Node root) {
        Node current = root;

        while (current != null) {
            if (current.left == null) {
                System.out.print(current.data + " ");
                current = current.right; // Move to the right child
            } else {
                // Find the inorder predecessor
                Node predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    // Establish link from predecessor to current node
                    predecessor.right = current;
                    current = current.left; // Move to the left child
                } else {
                    // Remove link and print current node
                    predecessor.right = null;
                    System.out.print(current.data + " ");
                    current = current.right; // Move to the right child
                }
            }
        }
    }

    // This function finds predecessor and
    // successor of data in BST. It sets predecessor
    // and successor as predecessor and successor
    // respectively
    Node predecessor = new Node();
    Node successor = new Node();

    void findPreSuc(Node root, int data) {
        // Base case
        if (root == null)
            return;

        // If data is present at root
        if (root.data == data) {

            // The maximum value in left
            // subtree is predecessor
            if (root.left != null) {
                Node temp = root.left;
                while (temp.right != null)
                    temp = temp.right;

                predecessor = temp;
            }

            // The minimum value in
            // right subtree is successor
            if (root.right != null) {
                Node temp = root.right;

                while (temp.left != null)
                    temp = temp.left;

                successor = temp;
            }
            return;
        }

        // If data is smaller than
        // root's data, go to left subtree
        if (root.data > data) {
            successor = root; // if right subtree is null we in adv set root as successor
            findPreSuc(root.left, data);
        }

        // Go to right subtree
        else {
            predecessor = root; // if left subtree is null we in advance set root as predecessor
            findPreSuc(root.right, data);
        }
    }

    // DELETE

    public Node deleteNode(Node root, int data) {
        if (root == null) {
            return null;
        }

        // If the node to be deleted is found
        if (data < root.data) {
            // Recursively delete from the left subtree
            root.left = deleteNode(root.left, data);
        } else if (data > root.data) {
            // Recursively delete from the right subtree
            root.right = deleteNode(root.right, data);
        } else {
            // Node with the given value found, perform deletion

            // Case 1: Node with no child or one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case 2: Node with two children
            // Find the inorder successor (smallest node in the right subtree)
            // or also for inorder predecessor (greatest node in the left subtree)
            Node minRight = minVal(root.right);
            // Copy the inorder successor's data to this node
            root.data = minRight.data;
            // Recursively delete the inorder successor
            root.right = deleteNode(root.right, minRight.data);
        }
        return root;
    }

}

public class _184_BST_Implimentation {
    public static void main(String[] args) {

        BST b = new BST();
        System.out.println("Enter Data To create BST !");
        // 50 20 70 10 30 90 110 -1
        Node root = b.takeInout(null);

        System.out.println("Printing data");
        b.display(root);

        System.out.println();
        System.out.println("Inorder");
        b.inOrder(root);

        System.out.println();
        System.out.println("preOrder");
        b.preOrder(root);

        System.out.println();
        System.out.println("PostOrder");
        b.postOrder(root);

        System.out.println();
        System.out.println();

        System.out.println("Min data is :" + b.minVal(root).data);
        System.out.println("Max data is :" + b.maxVal(root).data);

        b.findPreSuc(root, 70);
        System.out.println(b.predecessor.data);
        System.out.println(b.successor.data);

        // DELETE
        b.deleteNode(root, 50);

        System.out.println("Printing data");
        b.display(root);

        System.out.println();
        System.out.println("Inorder");
        b.inOrder(root);

        System.out.println();
        System.out.println("preOrder");
        b.preOrder(root);

        System.out.println();
        System.out.println("PostOrder");
        b.postOrder(root);

        System.out.println();
        System.out.println();

        System.out.println("Min data is :" + b.minVal(root).data);
        System.out.println("Max data is :" + b.maxVal(root).data);

        b.findPreSuc(root, 70);
        System.out.println(b.predecessor.data);
        System.out.println(b.successor.data);

    }

}
