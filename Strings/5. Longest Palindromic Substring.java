//treat every index as potential center 
//expand every index
// <- i ->
//for every index there will be two cases:
//odd index center is i
//even index center is from i to i + 1

class Solution {
    int start = 0;
    int maxLen = 0;

    public String longestPalindrome(String s) {
        if(s.length() < 1 || s == null){
            return "";
        }

        for(int i = 0; i < s.length(); i++){
            //case 1. odd center
            expandAroundCenter(s, i, i);

            //case 2: even center
            expandAroundCenter(s , i, i + 1);
        }

        return s.substring(start, start + maxLen);
    }

    public void expandAroundCenter(String s, int left, int right){
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }

        //actual length is left + 1 to right - 1
        int currLength = right - left - 1;

        if(currLength > maxLen){
            maxLen = currLength;
            start = left + 1;
        }
    }
}