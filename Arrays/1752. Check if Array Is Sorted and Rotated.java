//core logic is to find number of breakpoints
//if it is 1 array is rotated and sorted else it is not
class Solution {
    public boolean check(int[] nums) {
        //count number of breakpoints
        int count=0;
        int n = nums.length;

        for(int i = 0; i < n; i++){
            //this formula makes array circular
            // Example: if n=5 and i=4, then (4+1)%5 is 0.
            // So, it compares nums[4] with nums[0].
            int next= (i + 1) % n;

            if(nums[i] > nums[next])
                count++;
        }

        if(count <= 1)
            return true;
            
        return false;
    }
}