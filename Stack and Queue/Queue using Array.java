class myQueue {
    int[] arr;
    int front;
    int rear;
    int capacity;
    int currSize;

    // Constructor
    public myQueue(int n) {
        // Define Data Structures
        this.capacity = n;
        this.arr = new int[n];
        this.front = 0;
        this.rear = -1;
        this.currSize = 0;
    }

    public boolean isEmpty() {
        // Check if queue is empty
        if(this.currSize == 0)
            return true;
        return false;
    }

    public boolean isFull() {
        // Check if queue is full
        if(this.currSize == this.capacity){
            return true;
        }
        return false;
    }

    public void enqueue(int x) {
        // Enqueue
        if(isFull())
            return;
        this.rear = (this.rear + 1) % this.capacity; //move rear by 1 step and wrap
        this.arr[this.rear] = x; //add new element at back
        currSize++;
    }

    public void dequeue() {
        // Dequeue
        if(isEmpty())
            return;
        this.front = (this.front + 1) % this.capacity; //decrease front by 1 step and wrap
        currSize--;
    }

    public int getFront() {
        // Get front element
        if(isEmpty())
            return -1;
        return this.arr[this.front];
    }

    public int getRear() {
        // Get last element
        if(isEmpty())
            return -1;
        return this.arr[this.rear];
    }
}
