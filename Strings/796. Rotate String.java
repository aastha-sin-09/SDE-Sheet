//1. check if s is of same length as that of goal
//2. concatenate the string with string itself
//3. check if goal is a substring of concatenate
class Solution {
    public boolean rotateString(String s, String goal) {
       if(s.length() != goal.length()){
        return false;
       } 

       String joined = s + s;

       return joined.contains(goal);
    }
}