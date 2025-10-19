//here matrix is 2D, but we apply Binary Search in 1D, so for converting from 1D to 2D
//we have to change indexing.
//to get mid value: matrix[mid / cols][mid % cols]
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        if(m == 0){
            return false;
        }

        //take first element and last element
        int left = 0;
        int right = m * n - 1;

        while(left <= right){
            int mid = (left + right) / 2;

            //formula to convert 1D to 2D
            int midVal = matrix[mid / n][mid % n];

            if(midVal == target){
                return true;
            }else if(midVal < target){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return false;
    }
}