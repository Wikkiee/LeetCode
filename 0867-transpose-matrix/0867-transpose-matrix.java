class Solution {
    public int[][] transpose(int[][] matrix) {
        
        int[][] res = new int[matrix[0].length][matrix.length];
        for(int row = 0; row<res.length;row++){
            for(int col = 0; col<res[row].length;col++){
                res[row][col]= matrix[col][row];
            }
        }
        return res;    
    }
}