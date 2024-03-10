class Solution {
    public int projectionArea(int[][] grid) {
        int xy = 0, yz =0 , zx= 0;
        for(int col = 0; col<grid[0].length;col++){
            int maxVal = 0;
            for(int row = 0 ; row<grid.length;row++){
                maxVal = Math.max(grid[row][col],maxVal);
            }
            xy += maxVal;
        }
        
        for(int[] row:grid){
            int temp = 0;
            int large = 0;
            for(int num:row){
                large = Math.max(num,large);
                if(num>0){
                    zx++;
                }
            }
            yz += large;
        }


        return xy+yz+zx;
    }
}