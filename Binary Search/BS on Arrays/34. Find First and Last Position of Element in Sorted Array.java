//here you have to find first and last occurence of element.
//first occurence: lower bound
//last occurence: upper bound
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        res[0] = findFirst(nums,target);
        res[1] = findLast(nums,target);
        return res;
    }

    //find first occurence using lower bound
    public int findFirst(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = -1;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                ans = mid;
                high = mid - 1; //keep looking left for first occurence
            }else if(nums[mid] >= target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }

    //find last occurence using lower bound
    public int findLast(int[] nums, int target){
        int n = nums.length;
        int low = 0, high = n - 1;
        int ans = -1;
        
        while(low <= high){
            int mid = (low + high)/2;
            if(nums[mid] == target){
                ans = mid;
                low = mid + 1; //keep looking right for last occurence 
            }else if(nums[mid] > target){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }
        return ans;
    }
}