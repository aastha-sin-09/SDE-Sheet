//here you have to find the insert position, so concept of lower bound will be used
class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;

        int low = 0, high = n - 1;
        int ans = n;

        while(low <= high){
            int mid = (low + high) / 2;

            if(nums[mid] >= target){
                ans = mid;
                high = high - 1;
            } else if(nums[mid] < target){
                low = mid + 1;
            } else{
                return mid; //nums[mid] == target
            }
        }
        return ans;
    }
}