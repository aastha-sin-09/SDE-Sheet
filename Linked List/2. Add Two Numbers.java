class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        //create a dummy node for edge cases for head of listNode
        ListNode temp = new ListNode(0);
        ListNode curr = temp;

        int carry = 0;

        while(l1 != null || l2 != null){
            int x = (l1 != null) ? l1.val : 0;
            int y = (l2 != null) ? l2.val : 0;

            int sum = x + y + carry;

            carry = sum / 10; //calculating carry
            curr.next = new ListNode(sum % 10); //new digit with carry. It will be a node
            curr = curr.next; //current will point to the new node of the new digit

            //for continuing while loop
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next; 
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }

        return temp.next;
    }
}