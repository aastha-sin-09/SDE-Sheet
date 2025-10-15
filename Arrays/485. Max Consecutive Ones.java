//maintain a current streak and maximum streak
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;

        int count = 0;
        int maxCount = 0;

        for(int i = 0; i < n; i++){
            if(nums[i] == 1){
                count+=1;
            }
            if(nums[i] == 0){
                count = 0;
            }

            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}