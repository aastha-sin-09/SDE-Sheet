class Solution {
    public void sortColors(int[] nums) {
        //create three pointers for '0','1','2'
        int low = 0, mid = 0, high = nums.length - 1;
        //let mid pointer be moving
        while(mid <= high){
            //if mid finds 0 then it will swap with low
            if(nums[mid] == 0){
                //swap arr[low] and arr[mid]
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            //if mid finds 1 it will increment itself
            else if(nums[mid] == 1){
                mid++;
            } 
            //else it it 2, swap with high
            else{
                //swap arr[mid] and arr[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}