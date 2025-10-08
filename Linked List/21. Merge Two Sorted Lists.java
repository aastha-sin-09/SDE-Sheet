class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1); //a dummy node
        ListNode tail = dummy;

        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        //after loop, one of the list nodes must be remaining
        if(list1 != null){
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        //after dummy, the merged list starts
        return dummy.next;
    }
}