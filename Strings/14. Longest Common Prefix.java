//       i=0  i=1  i=2  i=3  i=4  i=5
//       -----------------------------
// j=0 |  f    l    o    w    e    r
// j=1 |  f    l    o    w
// j=2 |  f    l    i    g    h    t

//iterate in first word.
//iterate down vertically to detect mismatch
class Solution {
    public String longestCommonPrefix(String[] strs) {
        for(int i = 0; i < strs[0].length(); i++){
            int curr = strs[0].charAt(i);

            for(int j = 1; j < strs.length; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != curr){
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0];
    }
}