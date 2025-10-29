//character replacement = length - maxFreq
class Solution {
    public int characterReplacement(String s, int k) {
        int[] charCount = new int[26];

        int start = 0;
        int maxFreq = 0;
        int maxLen = 0;

        for(int end = 0; end < s.length(); end++){
            int rightCharIdx = s.charAt(end) - 'A'; //this for updating charcount array
            charCount[rightCharIdx]++;

            maxFreq = Math.max(maxFreq, charCount[rightCharIdx]);

            //replacement = length - maxFreq
            while((end - start + 1) - maxFreq > k){
                int leftCharIdx = s.charAt(start) - 'A'; //this for updating charcount array
                charCount[leftCharIdx]--;
                start++; //shrink the window
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }
        return maxLen;
    }
}