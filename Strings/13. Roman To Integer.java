//apply logic that if curr < i + 1 value the, subtract curr from total
//IV = I - V = 1 - 5 = 4
class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();

        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int total = 0;

        for(int i = 0; i < s.length(); i++){
            int curr = map.get(s.charAt(i));

            if(i < s.length() - 1 && curr < map.get(s.charAt(i + 1))){
                total -= curr;
            }else{
                total += curr;
            }
        }
        return total;
    }
}