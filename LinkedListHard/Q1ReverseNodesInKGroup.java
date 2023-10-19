public class Q1ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode myNode = new ListNode(0);
        myNode.next = head;
        ListNode prevEndPoint = myNode;

        while(head != null)
        {
            ListNode startPoint = head;
            ListNode endPoint = getEndPoint(head, k);

            if (endPoint == null)
            {
                break;
            }

            prevEndPoint.next = reverseList(startPoint, endPoint.next);
            prevEndPoint = startPoint;
            head = prevEndPoint.next;
        }

        return myNode.next;

    }

    private ListNode getEndPoint(ListNode head, int k)
    {
        while(head != null && --k > 0)
        {
            head = head.next;
        }

        return head;
    }

    private ListNode reverseList( ListNode startP, ListNode endP)
    {
        ListNode prev = endP;
        while(startP != endP)
        {
            ListNode next = startP.next;
            startP.next = prev;
            prev = startP;
            startP = next;
        }

        return prev;
    }
}
