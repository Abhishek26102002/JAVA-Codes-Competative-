public class _124_LL_Sort012 {
    static Node segregate(Node head) {
        if (head == null) {
            return null;
        }
        int one = 0;
        int two = 0;
        int three = 0;

        Node temp = head;

        while (temp != null) {
            if (temp.data == 0) {
                one++;
            }
            if (temp.data == 1) {
                two++;
            }
            if (temp.data == 2) {
                three++;

            }
            temp = temp.next;
        }
        temp = head;
        while (temp != null) {
            if (one != 0) {
                temp.data = 0;
                one--;
            } else if (two != 0) {
                temp.data = 1;
                two--;
            } else if (three != 0) {
                temp.data = 2;
                three--;
            }
            temp = temp.next;
        }
        return head;
    }

    // ------------------------
    // method 2
    static Node insertAtLast(Node tail, Node curr) {
        tail.next = curr;
        tail = curr;
        return tail;
    }

    static Node segrigatNode2(Node head) {

        Node zeroHead = new Node(-1);
        Node zeroTail = zeroHead;
        Node oneHead = new Node(-1);
        Node oneTail = oneHead;
        Node twoHead = new Node(-1);
        Node twoTail = twoHead;

        Node curr = head;

        // add seperate Nodes-->

        while (curr != null) {
            if (curr.data == 0) {
               zeroTail= insertAtLast(zeroTail, curr);
            } else if (curr.data == 1) {
               oneTail= insertAtLast(oneTail, curr);

            } else if (curr.data == 2) {

               twoTail= insertAtLast(twoTail, curr);
            }
            curr = curr.next;
        }

        // ---- Merg Nodes

        if (oneHead.next != null) {
            zeroTail.next = oneHead.next;
        } else {
            zeroTail.next = twoHead.next;
        }

        oneTail.next = twoHead.next;
        twoTail.next = null;

        // setting-up head
        head = zeroHead.next;

        return head;

    }
}
