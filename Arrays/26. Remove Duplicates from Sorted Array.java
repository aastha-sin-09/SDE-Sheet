//fast pointer and slow pointer technique will be used.
//we have to overwrite in the original array
class Solution {
    public int removeDuplicates(int[] nums) {
        //slow pointer -> slow pointer comtains unique elements
        int i = 0;

        //fast pointer -> scans the whole array
        for (int j = 0; j < nums.length; j++){
            //if we found a unique element
            if(nums[i] != nums[j]){
                //increase the pointer
                i++;
                //overwrite in the original array
                nums[i] = nums[j];
            }
        }

        //At end of loop, i + 1 elements will be unique
        return i + 1;
    }
}