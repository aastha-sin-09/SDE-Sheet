class Solution {
    static ArrayList<Integer> nextSmallerEle(int[] arr) {
        // code here
        HashMap<Integer, Integer> nseMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        for(int i : arr){
            while(!stack.isEmpty() && i < stack.peek()){
                nseMap.put(stack.pop(), i);
            }
            stack.push(i);
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            res.add(nseMap.getOrDefault(arr[i], -1));
        }
        
        return res;
    }
}