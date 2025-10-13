//instead of hashmap, create only array of alphabets
//for substring, calculate max and min

class Solution {
    public int beautySum(String s) {
        int totalBeauty = 0;

        for(int i = 0; i < s.length(); i++){

            int[] freq = new int[26];

            for(int j = i; j < s.length(); j++){

                freq[s.charAt(j) - 'a']++;

                int maxF = Integer.MIN_VALUE;
                int minF = Integer.MAX_VALUE;

                for(int k = 0; k < 26; k++){
                    if(freq[k] > 0){
                        maxF = Math.max(maxF, freq[k]);
                        minF = Math.min(minF, freq[k]);
                    }
                }

                totalBeauty += (maxF - minF);
            }
        }
        return totalBeauty;
    }
}