class Solution {
    public String[] findRelativeRanks(int[] score) {            

        HashMap<Integer,String> map = new HashMap();
        for(int i = 0;i<score.length;i++){
            int max = 0;
            int j = 0;
            while( j<score.length){
                if(map.containsKey(score[j])){
                   j++;
                    continue; 
                }
                max= Math.max(max,score[j]);
                j++;
            }
            System.out.println(max);
            if(i == 0){
                    map.put(max,"Gold Medal");
                }
                if(i == 1){
                    map.put(max,"Silver Medal");
                }
                if(i == 2){
                    map.put(max,"Bronze Medal");
                }
                if(i > 2){
                    map.put(max,""+(i+1));
                }
            
        }
        String[] res = new String[score.length];
        for(int i =0;i<res.length;i++){
                    res[i] = map.get(score[i]);
        }
        return res;
    }
}