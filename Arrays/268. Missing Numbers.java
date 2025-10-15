//1.calculate expected sum
//2. calculate actual sum
//3. calculate the difference between two sums, the difference is missing number
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        int SUM1 = (n*(n + 1)) / 2;

        int SUM2 = 0;
        for(int i = 0; i < n; i++){
            SUM2 += nums[i];
        }

        int missing = SUM1 - SUM2;
        return missing;
    }
}