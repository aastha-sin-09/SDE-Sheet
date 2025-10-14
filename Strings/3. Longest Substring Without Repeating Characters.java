class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int maxLen = 0;
        int left = 0;

        for(int right = 0; right < s.length(); right++){
            char curr = s.charAt(right);
            
            //if there is duplicate element found then shrink from left
            if(map.containsKey(curr)){
                left = Math.max(left, map.get(curr) + 1);
            }

            map.put(curr, right);

            int currLen = right - left + 1;

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}