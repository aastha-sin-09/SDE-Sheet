// Reverse the first part: Reverse the elements from the beginning up to the point of rotation.
// Reverse the second part: Reverse the elements from the rotation point to the end.
// Reverse the whole thing: Reverse the entire array.
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;

        // This handles cases where k is larger than the array length.
        k = k%n;

        // STEP 1: Reverse the first part of the array.
        Reverse(nums, 0, n - k - 1);
        // STEP 2: Reverse the second part of the array.
        Reverse(nums, n - k, n - 1);
        // STEP 3: Reverse the entire array.
        Reverse(nums, 0, n - 1);
    }

    
    public void Reverse(int[] arr, int i, int j){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}