class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        int minX = m, minY = n;
        for(int[] operation:ops){
            minX = Math.min(minX,operation[0]);
            minY = Math.min(minY,operation[1]);
        }
    return minX*minY;
    }
}