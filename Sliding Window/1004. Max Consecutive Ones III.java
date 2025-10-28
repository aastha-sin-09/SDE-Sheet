//variable size window
//defective product line ko hatana hai toh token use kar k htaao
//agar k sey bada ho jaye defective product toh aage sey defectice product hta kar apna token bachaao
class Solution {
    public int longestOnes(int[] nums, int k) {
        int start = 0;
        int maxLen = 0;

        int specialElementCount = 0;

        for(int end = 0; end < nums.length; end++){
            if(nums[end] == 0){
                specialElementCount++;
            }

            while(specialElementCount > k){
                //get the start element
                int startElement = nums[start];

                if(startElement == 0){
                    specialElementCount--;
                }

                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}