//imagine a snail crawling, at every step sum will be calculated.
//snail will check if ever it has encountered that type of length before(sum - k), if yes then count will be updated
class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();

        map.put(0,1);

        for(int num : nums){
            sum += num;

            if(map.containsKey(sum - k)){
                count += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum,0) + 1);
        }

        return count;
    }
}