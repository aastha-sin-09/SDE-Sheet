class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;

        //markers
        boolean isFirstRowZero = false;
        boolean isFirstColZero = false;

        //check main road(row)
        for(int j = 0; j < c; j++){
            if(matrix[0][j] == 0){
                isFirstRowZero = true;
                break;
            }
        }

        //check main road(col)
        for(int i = 0; i < r; i++){
            if(matrix[i][0] == 0){
                isFirstColZero = true;
                break;
            }
        }

        //check inner matrix
        for(int i = 1; i < r; i++){
            for(int j = 1; j < c; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        //change inner matrix
        for(int i = 1; i < r; i++){
            for(int j = 1; j < c; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }

        //repair main road(row)
        if(isFirstRowZero){
            for(int j = 0; j < c; j++){
                matrix[0][j] = 0;
            }
        }

        //repair main road(col)
        if(isFirstColZero){
            for(int i = 0; i < r; i++){
                matrix[i][0] = 0;
            }
        }
    }
}