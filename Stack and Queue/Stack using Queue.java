//step1: you have to implement stack using queue, so use Queue interface
class MyStack {

    Queue<Integer> q;

    public MyStack() {
        q = new LinkedList<>();
    }
    
    //it is hard method, so implement at last.
    //rotate the array, so that pop removes last element, and top shows last element.
    public void push(int x) {
        int size = q.size();

        q.add(x);
        
        //rotate the array so that element added is at top
        for(int i = 0; i < size; i++){
            q.add(q.remove());
        }
    }
    
    //it is easy method, so implement first
    public int pop() {
        return q.remove();
    }
    
    //implement first
    public int top() {
        return q.peek();
    }
    
    //implement first
    public boolean empty() {
        return q.isEmpty();
    }
}
