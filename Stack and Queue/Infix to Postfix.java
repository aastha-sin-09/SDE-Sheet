class Solution {
    static int precedence(char op){
        switch(op){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    
    public static String infixToPostfix(String st) {
        // code here
        //initialize the stack and result string
        StringBuilder postfixResult = new StringBuilder();
        Stack<Character> operatorStack = new Stack<>();
        
        //remove all whitespaces from infix expression
        String s = st.replaceAll("\\s+","");
        
        //scan the infix string
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            
            //Rule 1. If it is a operand, append it to result
            if(Character.isLetterOrDigit(c)){
                postfixResult.append(c);
            }
            
            //Rule 2: If '(' present then push it into stack
            else if(c == '('){
                operatorStack.push(c);
            }
            
            //Rule 3: If ')' present then pop it until '(' is found
            else if(c == ')'){
                while(!operatorStack.isEmpty() && operatorStack.peek() != '('){
                    postfixResult.append(operatorStack.pop());
                }
                
                //pop '(' completely
                if(!operatorStack.isEmpty()){
                    operatorStack.pop();
                }
            }
        
            //Rule 4: If it is an operator
            else{
                //check precedence. if stack wala element ka precedence jyada hai toh pop and send to postfix
                while(!operatorStack.isEmpty() && operatorStack.peek() != '(' &&
                    ((precedence(c) < precedence(operatorStack.peek())) ||
                       (precedence(c) == precedence(operatorStack.peek()) && c != '^')))
                {
                    postfixResult.append(operatorStack.pop());
                }
                
                //push the new operator
                operatorStack.push(c);
            }
        }
        
        //Rule 5: Pop all remaining operators from stack
        while(!operatorStack.isEmpty()){
            postfixResult.append(operatorStack.pop());
        }
            
        return postfixResult.toString();
    }
}