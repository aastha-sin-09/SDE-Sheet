class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null || k == 1){
            return head;
        }

        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode groupPrev = temp;

        while(true){
            //find the end of the group
            ListNode groupEnd = groupPrev;

            for(int i = 0; i < k; i++){
                groupEnd = groupEnd.next;
                if(groupEnd == null){
                    return temp.next;
                }
            }

            ListNode groupStart = groupPrev.next;
            ListNode nextGroupStart = groupEnd.next;

            ListNode curr = groupStart;
            ListNode prev = nextGroupStart;

            while(curr != nextGroupStart){
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            groupPrev.next = groupEnd;
            groupStart.next = nextGroupStart;
            groupPrev = groupStart;
        }
    }
}