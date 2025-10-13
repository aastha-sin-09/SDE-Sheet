//there can be two cases:
//1. "(": each time you enter through this, balance increases by 1
//2. ")": each time you exit through this, balance decreases
//you have to ignore main entrance and exit
//using stringbuilder is good option because it is mutable

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int balance = 0;

        for(char c : s.toCharArray()){
            if(c == '('){
                //to ignore main entrance, check balance > 0. if it is 0 we can't add it
                if(balance > 0){
                    res.append("(");
                }
                balance++;
            }else{
                balance--;
                //to ignore main exit, check balance. if it is 0 we can't add it.
                if(balance > 0){
                    res.append(")");
                }
            }
        }
        return res.toString();
    }
}