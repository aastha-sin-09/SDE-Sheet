//we can use hashmap for storing character unique count
//Priority Queue for sorting them as it sorts based on Priority queue
//Then create a stringBuilder to append characters based on their count
class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int freq = 0;

        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }

        PriorityQueue<Character> pq = new PriorityQueue<>((a,b) -> map.get(b) - map.get(a));
        pq.addAll(map.keySet());

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            char curr = pq.poll();
            int count = map.get(curr);

            for(int i = 0; i < count; i++){
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}