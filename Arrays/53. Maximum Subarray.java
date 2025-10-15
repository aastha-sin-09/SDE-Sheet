//Happiest Walk analogy:
//imagine taking a happy path, positive nums add to the sum, negative decreases
//most important: if ever in your path you happiness sum decreases and is less than 0
//take a new path from the next step. This is because negative happiness will drag you down.
class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;

        int max = Integer.MIN_VALUE; //max happiness achieved till now
        int sum = 0; //current happiness sum

        for(int i = 0; i < n; i++){
            sum += nums[i];

            if(sum > max){
                max = sum;
            }

            if(sum < 0){
                sum = 0;
            }
        }
        return max;
    }
}