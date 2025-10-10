class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        //1. edge case : if head is null or k = 0
        if(head == null || head.next == null || k == 0){
            return head;
        }

        //2. find the length of original linked list
        int length = 1;
        ListNode tail = head;
        while(tail.next != null){
            tail = tail.next;
            length++;
        }

        //3. Form a circle
        tail.next = head;

        //4. l - (k % l) - 1
        int stepNewTail = length - (k % length) - 1;

        //5. make a new tail
        ListNode newTail = head;
        for(int i = 0; i < stepNewTail; i++){
            newTail = newTail.next;
        }

        //new head will be just next to newTail
        ListNode newHead = newTail.next;
        //let the tail end
        newTail.next = null;

        return newHead;
    }
}