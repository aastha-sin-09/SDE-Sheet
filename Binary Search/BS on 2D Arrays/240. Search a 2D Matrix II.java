//use staircase anology because array is not fully sorted so you can't just convert 2D to 1D
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int row = 0;
        int col = cols - 1;

        while(row < rows && col > 0){
            int curr = matrix[row][col];

            if(curr == target){
                return true;
            }else if(curr > target){
                col--; //high = mid - 1 is equivalent to col--;
            }else{
                row++; //low = mid + 1 is equivalent to row++;
            }
        }
        return false;
    }
}