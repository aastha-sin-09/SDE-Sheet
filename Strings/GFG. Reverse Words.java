//Given a string s, reverse the string without reversing its individual words. Words are separated by dots(.).

// Note: The string may contain leading or trailing dots(.) or multiple dots(.) between two words. The returned string should only have a single dot(.) separating the words, and no extra dots should be included.


//leading and trailing dots are there. -> replace, trim can't be used
//reverse words -> stringBuilder append words in reverse order
//after every word add a dot -> when i > 0, append dot
class Solution {
    public String reverseWords(String s) {
        // Code here
        String words = s.replaceAll("^\\.+|\\.+ $","");
        String[] words2 = words.split("\\.+");
        
        StringBuilder rev = new StringBuilder();
        
        for(int i = words2.length - 1; i >= 0; i--){
            rev.append(words2[i]);
            
            if(i > 0){
                rev.append(".");
            }
        }
        
        return rev.toString();
    }
}