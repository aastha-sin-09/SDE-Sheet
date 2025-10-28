//variable window size
class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        int maxLen = 0;
        int start = 0;

        for(int end = 0; end < s.length(); end++){
            char curr = s.charAt(end);

            if(map.containsKey(curr)){
                start = Math.max(start, map.get(curr) + 1);
            }

            map.put(curr, end);

            int currLen = end - start + 1;

            maxLen = Math.max(maxLen, currLen);
        }

        return maxLen;
    }
}