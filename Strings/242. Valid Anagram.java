//check the length of both strings
//use hashmap
//first loop in s and populate the map
//second loop in t and check - if char of t not present in map then return false; otherwise decrement counter

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1); //always use getOrDefault for counting frequency
        }

        for(char c : t.toCharArray()){
            int count = map.getOrDefault(c,0);

            if(count == 0) return false;

            map.put(c, count - 1);
        }

        return true;
    }
}