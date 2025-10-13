//512 = last digit is 2 which is even. remove 2
//51 = last digit is 1 which is odd. SO largest is 51
//ASCII value of odd numbers is odd.
class Solution {
    public String largestOddNumber(String num) {
        //remove last digit if even
        for(int i = num.length() - 1; i >= 0; i--){
            char c = num.charAt(i);

            //convert char to digit
            int digit = c - '0';

            if(digit % 2 != 0){
                return num.substring(0, i + 1);
            }
        }
        //if after loop we don't find anything
        return "";
    }
}