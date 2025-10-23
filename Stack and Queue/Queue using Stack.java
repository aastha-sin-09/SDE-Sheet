//if we have to find the first element in stack, we have to pop all element and then we get the first element.
//that's what we have to do. pop all elements one by one and store that elements in another stack
//then we get the first element
class MyQueue {
    Stack<Integer> inputStack;
    Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }
    
    public void push(int x) {
        inputStack.push(x);
    }
    
    public int pop() {
        peek();
        return outputStack.pop();
    }
    
    public int peek() {
        //if output stack is empty, it's time to pour everything from inputStack to outputStack
        if(outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }

        return outputStack.peek();
    }
    
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}