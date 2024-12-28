class sol {
    static Node pre = null, suc = null;
    // c++ Code (NOT Running in java)
    public static void findPreSuc(Node root, int key) {
        Node temp = root;

        while (temp.data != key) {
            if (temp.data < key) {
                suc = temp;
                temp = temp.left;
            } else {
                pre = temp;
                temp = temp.right;
            }

        }
        // pre and succ
        // pre
        Node leftTree = temp.left;
        while (leftTree != null) {
            pre = leftTree;
            leftTree = leftTree.right;
        }

        // suc
        Node rightTree = temp.right;
        while (rightTree != null) {
            suc = rightTree;
            rightTree = rightTree.left;
        }

        /*
         * There are two static nodes defined above pre(representing predecessor) and
         * suc(representing successor) as follows:
         * static Node pre=null,suc=null
         * You need to update these both.
         * And the data inside these classes will be printed automatically by the driver
         * code.
         */
    }
}

class sol2 { // Code for java
    static Node pre = null, suc = null;

    public static void findPreSuc(Node root, int key) {
        if (root == null)
            return;
        if (root.data < key) {
            pre = root;
            findPreSuc(root.right, key);
        } else if (root.data > key) {
            suc = root;
            findPreSuc(root.left, key);
        } else {
            findPreSuc(root.left, key);
            findPreSuc(root.right, key);
        }
    }
}