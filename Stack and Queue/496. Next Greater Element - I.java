//num1 ka elements ko num2 mei dhundhna hai
//num2 mei hamesha right mei dekhte rehna hai
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        //Map to store (element,next_greater_element)
        HashMap<Integer, Integer> ngeMap = new HashMap<>();

        //Monotonic Stack
        Stack<Integer> stack = new Stack<>();

        //process num2
        for(int num : nums2){
            while(!stack.isEmpty() && num > stack.peek()){
                ngeMap.put(stack.pop(), num);
            }
            stack.push(num);
        }

        //After 'for loop' any elements left in stack have no next greater element
        int[] res = new int[nums1.length];
        for(int i = 0; i < nums1.length; i++){
            res[i] = ngeMap.getOrDefault(nums1[i], -1);
        }

        return res;
    }
}