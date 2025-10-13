//there are 2 rules for this:
//1. consistent mapping: s -> t
//2. unique mapping: no two different characters in s can map to the same character in t
//use HashMap for rule1 and Set for rule2

class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        HashMap<Character, Character> st = new HashMap<>();
        Set<Character> tchars = new HashSet<>();

        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);

            if(st.containsKey(charS)){
                if(st.get(charS) != charT){
                    return false;
                }
            }else{
                if(tchars.contains(charT)){
                    return false;
                }

                st.put(charS, charT);
                tchars.add(charT);
            }
        }
        return true;
    }
}