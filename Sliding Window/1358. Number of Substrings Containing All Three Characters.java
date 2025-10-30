class Solution {
    public int numberOfSubstrings(String s) {
        int[] count = new int[3]; //for storing 'a', 'b', 'c'
        int start = 0;
        int numSubstring = 0;

        if(s.length() < 3){
            return 0;
        }

        for(int end = 0; end < s.length(); end++){
            count[s.charAt(end) - 'a']++; //increasing frequency in array

            while(count[0] > 0 && count[1] > 0 && count[2] > 0){
                count[s.charAt(start) - 'a']--; //if all three present then shrink from start
                start++;
            }

            numSubstring += start; //counting number of subarrays from start
        }

        return numSubstring;
    }
}