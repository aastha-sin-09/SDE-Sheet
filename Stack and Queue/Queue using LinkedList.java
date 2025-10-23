// Node class
class Node {
    int data;
    Node next;

    Node(int new_data) {
        data = new_data;
        next = null;
    }
}

// Queue class
class myQueue {
    Node front;
    Node rear;
    int currSize;

    public myQueue() {
        // Initialize your data members
        this.front = null;
        this.rear = null;
        this.currSize = 0;
    }

    public boolean isEmpty() {
        // check if the queue is empty
        if(this.currSize == 0){
            return true;
        }
        return false;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
        Node newNode = new Node(x);
        if(isEmpty()){
            this.front = newNode;
            this.rear = newNode;
        }else{
            this.rear.next = newNode;
            this.rear = newNode;
        }
        this.currSize++;
    }

    public void dequeue() {
        // Removes the front element of the queue
        if(isEmpty())
            return;
        this.front = this.front.next;
        this.currSize--;
        if(this.currSize == 0){
            this.rear = null;
        }
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(isEmpty())
            return -1;
        return this.front.data;
    }

    public int size() {
        // Returns the current size of the queue.
        return this.currSize;
    }
}
