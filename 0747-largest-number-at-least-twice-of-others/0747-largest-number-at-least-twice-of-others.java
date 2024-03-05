class Solution {
    public int dominantIndex(int[] nums) {
        if(nums.length <=1){
            return -1;
        }    
        HashMap<Integer,Integer> map = new HashMap();
        for(int i = 0;i<nums.length;i++){
            map.put(nums[i],i);
        }
        Arrays.sort(nums);
        try{
            if(nums[nums.length-1]/nums[nums.length-2] >= 2){
                return map.get(nums[nums.length-1]);
            }
        }catch(Exception e){
            return map.get(nums[nums.length-1]);
        }

        return -1;
    }
}