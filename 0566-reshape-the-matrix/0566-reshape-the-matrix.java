class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if(mat.length * mat[0].length != r*c){
            return mat;
        }
        int[][] res = new int[r][c];
        int cindex = 0;
        int rindex = 0;
        for(int i = 0;i<mat.length;i++){
            for(int j = 0;j<mat[i].length;j++){
                if(cindex == c){
                    rindex++;
                    cindex = 0;
                }
                res[rindex][cindex] = mat[i][j];
                cindex++;
            }
        }

        return res;
    }
}