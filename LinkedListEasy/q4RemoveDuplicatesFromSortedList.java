public class q4RemoveDuplicatesFromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if( head == null)
        {
            return head;
        }
        ListNode myNode = head;
        while(myNode.next != null)
        {
            if(myNode.val == myNode.next.val)
            {
                myNode.next = myNode.next.next;
            }
            else
            {
                myNode = myNode.next;
            }
        }

        return head;
    }

}
