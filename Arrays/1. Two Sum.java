//using for loop will give O(n^2) complexity
//So instead use two hashmap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = ans[1] = -1;

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int remaining = target - nums[i];
            if(map.containsKey(remaining)){
                ans[0] = i;
                ans[1] = map.get(remaining);
                return ans;
            }
            map.put(nums[i],i);
        }
        return ans;
    }
}