public class _122_Ll_removeDuplicate {
    //remove duplicate form sorted LinkedList
    public Node deleteDuplicates(Node head) {
        if(head==null){
            return null;
        }

        Node curr=head;
        while(curr!=null){
            //if equals
            if( (curr.next!=null) &&curr.data==curr.next.data){
                Node next_next=curr.next.next;
                // Node toDelete=curr.next;
                // delete(toDelete);
                curr.next=next_next;

            }
            else{
                curr=curr.next;
            }
        }
        return head;
    }
}
