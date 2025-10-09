public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        //edge case: if either of them is null, they won't intersect
        if(headA == null || headB == null){
            return null;
        } 

        ListNode pA = headA;
        ListNode pB = headB;

        while(pA != pB){
            pA = (pA == null) ? headB : pA.next; //if pointerA comes to end then join the track of B
            pB = (pB == null) ? headA : pB.next; //vice versa
        }

        //loop breaks when both pointers are equal
        return pA;
    }
}