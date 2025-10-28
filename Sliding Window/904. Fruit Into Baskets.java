//disguise question of longest subarray with k distinct characters
class Solution {
    public int totalFruit(int[] fruits) {
        int maxLen = 0;
        int start = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int end = 0; end < fruits.length; end++){
            int curr = fruits[end]; //add new fruit from end
            map.put(curr, map.getOrDefault(curr, 0) + 1);

            while(map.size() > 2){
                int startFruit = fruits[start];

                //remove it from map
                map.put(startFruit, map.getOrDefault(startFruit, 0) - 1);

                if(map.get(startFruit) == 0){
                    map.remove(startFruit);
                }

                start++;
            }

            maxLen = Math.max(maxLen, end - start + 1);
        }

        return maxLen;
    }
}