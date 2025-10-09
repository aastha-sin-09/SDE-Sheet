public class Solution {
    public ListNode detectCycle(ListNode head) {
        //edge case: empty or single node list
        if(head == null || head.next == null){
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        //find the meeting point
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        //if fast pointer reached end, there is no cycle
        if(fast == null || fast.next == null){
            return null;
        }

        fast = head; //reset one pointer to the head

        //move both pointers one at a time until they meet again
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }

        //the meeting point is start of the cycle
        return slow;

    }
}