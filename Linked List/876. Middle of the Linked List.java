class Solution {
    public ListNode middleNode(ListNode head) {
        //Tortoise Hare Algo
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //At the end of loop, slow pointer will be in the middle
        return slow;
    }
}