class Solution {
    public int surfaceArea(int[][] grid) {
        int len = grid.length;
        int total = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[i].length;j++){
                if(grid[i][j]>0){
                    total += 2;
                    total += 4 * grid[i][j];
                    if(j+1<len){
                        total -= 2 * Math.min(grid[i][j],grid[i][j+1]);
                    }
                    if(i+1<len){
                        total -= 2 * Math.min(grid[i][j],grid[i+1][j]);
                    }
                }
            }
        }

        return total;
    }
}