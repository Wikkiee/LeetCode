class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int[][] ans = new int[jewels.length()][2];
        int idx = 0;
        for(int i : jewels.toCharArray()){
            ans[idx][0] = i;
            idx++;
        }
        idx = 0;
        for(int i : stones.toCharArray()){
            for(int j = 0;j<ans.length;j++){
                if(ans[j][0] == i){
                    ans[j][1] += 1; 
                }
            }

        }
        int count = 0;
        for(int[] i : ans){
           
                if(i[1]>0){
                    count += i[1];
                }

        }
        return count;
    }
}