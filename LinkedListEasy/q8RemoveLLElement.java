public class q8RemoveLLElement {
    public ListNode removeElements(ListNode head, int val) {

        //edge case
        if(head == null)
        {
            return head;
        }

        ListNode  prev = null;
        ListNode curr = head;

        while( curr != null)
        {
            if(curr.val == val && curr ==head)
            {
                head = head.next;
                curr = head;
            }
            else if (curr.val == val)
            {
                prev.next = curr.next;
                curr = curr.next;
            }
            else
            {
                prev = curr;
                curr = curr.next;
            }
        }
        return head;
    }
}

