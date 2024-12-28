import java.util.HashMap;
import java.util.Map;
class Node {
    int data;
    Node next , arb;
    public Node bottom;

    Node(int d) {
        data = d;
        next = null;
        arb = null;
    }
}
class _128_LL_clone {
     Node copyList(Node head) {
        // your code here
        Map<Node, Node> map = new HashMap<>();
        Node temp = head;
        while(temp!=null) {
            Node newNode = new Node(temp.data);
            map.put(temp, newNode);
            temp = temp.next;
        }
        
        Node dummyNode = new Node(-1);
        temp = head;
        while(temp!=null){
            Node node = map.get(temp);
            Node next = map.get(temp.next);
            Node arb = map.get(temp.arb);
            
            node.next = next;
            node.arb = arb;
            
            if (dummyNode.next==null){
                dummyNode.next = node;
            }
            temp = temp.next;
        }
        Node newHead = dummyNode.next;
        return newHead;
    }
}
