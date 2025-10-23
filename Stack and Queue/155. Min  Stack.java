//we will be creating two stacks
//one for storing data values
//another for storing min values
class MinStack {

    Stack<Integer> dataStack;
    Stack<Integer> minStack;

    public MinStack() {
        dataStack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        dataStack.push(val);
        if(minStack.isEmpty() || minStack.peek() >= val){ //if empty or val smaller then only push
            minStack.push(val);
        }
    }
    
    public void pop() {
        int poppedVal = dataStack.pop();
        if(poppedVal == minStack.peek()){ //remove duplicates from minStack
            minStack.pop();
        }
    }
    
    public int top() {
        return dataStack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
