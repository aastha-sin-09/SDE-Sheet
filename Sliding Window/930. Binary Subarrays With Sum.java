class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int count = 0; //count of valid subarrays

        int currSum = 0; //sum from index 0 to the current index

        //HashMap to store prefixSum and frequency
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0,1); //put prefix sum, frequency //this is must in prefix types question

        for(int end = 0; end < nums.length; end++){
            currSum += nums[end];

            int complement = currSum - goal; //this is also must in prefix types question

            count += map.getOrDefault(complement, 0); //for counting total subarrays

            map.put(currSum, map.getOrDefault(currSum, 0) + 1); //put it in map with current prefix sum and frequency
        }
        return count;
    }
}