//remove leading and trailing spaces. -> trim()
//for reversing remove any extra space. ->split("\\s+")
//only one space should be there ->append(" ") after every word
class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");

        StringBuilder rev = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            rev.append(words[i]);

            if(i > 0){
                rev.append(" ");
            }
        }

        return rev.toString();
    }
}