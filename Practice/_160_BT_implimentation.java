import java.util.Scanner;

class BinaryTree {
    public BinaryTree() {

    }

    private static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
        }
    }

    public Node root;

    // insert element
    public void populate(Scanner scanner) {
        System.out.println("Enter the root Node :");
        int data = scanner.nextInt();

        root = new Node(data);
        populate(scanner, root);
    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("Do you want insert left of " + node.data);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("Enter the Ele , left of " + node.data + "-->");
            int data = scanner.nextInt();
            node.left = new Node(data);
            populate(scanner, node.left);
        }

        System.out.println("Do you want to insert right of " + node.data);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("Enter the Ele , right of " + node.data + "-->");
            int data = scanner.nextInt();
            node.right = new Node(data);
            populate(scanner, node.right);
        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }
        System.out.println(indent + node.data);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prittydisplay() {
        prittydisplay(root, 0);
    }

    private void prittydisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prittydisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.println("|\t\t");
            }
            System.out.println("|-------->" + node.data);
        } else {
            prittydisplay(node.left, level + 1);

        }

    }
    // ----------------------------------- Function end here ---------------------

}

class _160_BT_implimentation {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BinaryTree bt = new BinaryTree();
        bt.populate(scanner);
        bt.display();
    }
}