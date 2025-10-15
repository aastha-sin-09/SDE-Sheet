// XORing a number with itself results in zero (A ^ A = 0).
// XORing a number with zero results in the number itself (A ^ 0 = A).
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for(int i = 0; i < nums.length; i++){
            xor = xor ^ nums[i];
        }
        //after loop, all paired numbers are gone and we are left only with a non duplicate element
        return xor;
    }
}