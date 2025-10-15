// Pointer j: Its job is to find and "sit on" the first available zero. 
//            It marks the position where the next non-zero element should be placed.
// Pointer i: This pointer scans ahead of j to find the next non-zero element.
class Solution {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = -1;

        //this loop only purpose it to find first idx of ZERO
        for(int i = 0; i < n; i++){
            if(nums[i] == 0){
                j = i;
                break;
            }
        }
        if(j == -1) return;
        
        //i starts from just after the idx of first zero
        for(int i = j + 1; i < n; i++){
            //as soon as we find a non-zero element we swap it
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        
    }
}