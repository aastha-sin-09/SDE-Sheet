// Stack class
class myStack {
    Node top;
    int currSize;

    public myStack() {
        // Initialize your data members
        this.top = null;
        this.currSize = 0;
    }

    public boolean isEmpty() {
        // check if the stack is empty
        if(this.top == null){
            return true;
        }
        return false;
    }

    public void push(int x) {
        // Adds an element x at the rear of the queue.
        Node newNode = new Node(x);
        newNode.next = this.top;
        this.top = newNode;
        this.currSize++;
    }

    public void pop() {
        // Removes the front element of the queue
        if(isEmpty()){
            return;
        }
        this.top = this.top.next;
        this.currSize--;
    }

    public int peek() {
        // Returns the front element of the stack.
        // If stack is empty, return -1.
        if(isEmpty()){
            return -1;
        }
        return this.top.data;
    }

    public int size() {
        // Returns the current size of the stack.
        return this.currSize;
    }
}
