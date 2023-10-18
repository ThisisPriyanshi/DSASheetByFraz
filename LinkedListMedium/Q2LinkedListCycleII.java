public class Q2LinkedListCycleII {
    public ListNode detectCycle(ListNode head) {

        int length = 0;

        //finding out if the cycle exists
        ListNode fast = head;
        ListNode slow = head;

        while( fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) //cycle exists
            {
                //find out the length of the cycle
                length = lengthCycle(slow);
                break;
            }
        }

        if (length == 0) {
            return null;
        }

        // find the start node
        ListNode f = head;
        ListNode s = head;

        while (length > 0) {
            s = s.next;
            length--;
        }

        // keep moving both forward and they will meet at cycle start
        while (f != s) {
            f = f.next;
            s = s.next;
        }
        return s;
    }

    public int lengthCycle(ListNode pointer) {

        ListNode temp = pointer;
        int length = 0;
        do {
            temp = temp.next;
            length++;
        } while (temp != pointer);
        return length;
    }
}
