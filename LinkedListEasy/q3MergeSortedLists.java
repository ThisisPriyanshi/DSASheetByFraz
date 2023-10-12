class q3MergeSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode head = new ListNode();
        ListNode myNode = head;

        while((list1 != null) && (list2 != null))
        {
            if(list1.val < list2.val)
            {
                myNode.next = list1;
                list1 = list1.next;
                myNode = myNode.next;
            }

            else
            {
                myNode.next = list2;
                list2 = list2.next;
                myNode = myNode.next;
            }
        }

        myNode.next = (list1 != null)? list1 : list2;

        return head.next;
    }
}