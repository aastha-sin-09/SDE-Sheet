//(Subarrays with exactly K) = (Subarrays with at most K) - (Subarrays with at most K-1)
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmostK(nums,k) - atmostK(nums, k -1);
    }

    public int atmostK(int[] nums, int k){
        int start = 0;
        int subarrayCount = 0;
        int oddCount = 0;

        for(int end = 0; end < nums.length; end++){
            if(nums[end] % 2 != 0){ //if odd, increment the counter
                oddCount++;
            }

            while(oddCount > k){
                if (nums[start] % 2 != 0) { //you have to shrink now, so think of two cases. leading is odd
                    oddCount--; //so decrease odd counter and then shrink
                }
                start++; //leading is even, so just shrink it
            }

            subarrayCount += (end - start + 1);
        }

        return subarrayCount;
    }
}