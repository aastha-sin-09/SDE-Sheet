class Solution {
    public Node flatten(Node root) {
        // code here
        if(root == null || root.next == null){
            return root;
        }
        
        Node rightNode = flatten(root.next);
        
        root = mergeLists(root, rightNode);
        
        return root;
        
    }
    
    public Node mergeLists(Node l1, Node l2){
        //use bottom pointers for merging lists
        Node temp = new Node(-1);
        Node curr = temp; 
        
        while(l1 != null && l2 != null){
            if(l1.data <= l2.data){
                curr.bottom = l1;
                l1 = l1.bottom;
            } else{
                curr.bottom = l2;
                l2 = l2.bottom;
            }
            curr = curr.bottom;
        }
        
        if(l1 != null){ 
            curr.bottom = l1;
        }else {
           curr.bottom = l2; 
        }
        
        return temp.bottom;
        
    }
}