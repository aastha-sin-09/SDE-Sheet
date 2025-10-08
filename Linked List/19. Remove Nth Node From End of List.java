class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //create dummy node before head
        ListNode temp = new ListNode(0);
        temp.next = head;

        ListNode slow = temp;
        ListNode fast = temp;

        //move fast ahead n times
        for(int i = 0; i < n; i++){
            fast = fast.next;
        }

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }

        //bypass the node to be deleted
        slow.next = slow.next.next;

        return temp.next;
    }
}