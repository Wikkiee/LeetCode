class Solution {
    public int maxFrequencyElements(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            
        }
        int maxFreq = 1;
        for(int val: map.values()){
            maxFreq = Math.max(val,maxFreq);
        }
        int count = 0;
        for(int key : map.keySet()){

            if(maxFreq == map.get(key)){
                count += maxFreq;
            }
        }
        return count;
    }
}