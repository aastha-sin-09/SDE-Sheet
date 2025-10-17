//binary search works in sorted array.
//but here array is sorted piecewise, so we'll apply binary search on the two halves.
class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        while(start <= end){
            int mid = (start + end)/2;

            if(nums[mid] == target){
                return mid;
            }

            //if left part is sorted
            if(nums[start] <= nums[mid]){
                if(nums[start] <= target && target <= nums[mid]){
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }
            //if right part is sorted
            else{
                if(nums[mid] <= target && target <= nums[end]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}