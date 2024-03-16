class Solution {
    public int findMaxLength(int[] nums) {
        int max = 0;
        int count = 0;
        Map<Integer,Integer> mp = new HashMap();
        mp.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            count += nums[i] == 1? 1:-1;
            if(mp.containsKey(count)){
                max = Math.max(max, i-mp.get(count));
            }else{
                mp.put(count,i);
            }
        }
        return max;
    }
}