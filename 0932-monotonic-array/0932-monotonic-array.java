class Solution {
    public boolean isMonotonic(int[] nums) {
        int x = 0;
        while(x+1<nums.length && nums[x] == nums[x+1]){
            x++;
        }
        if(x+1>= nums.length){
            return true;
        }
        if(nums[x]>=nums[x+1] ){
            int i = 0;
            while(i+1<nums.length){
                if(nums[i]>=nums[i+1]){
                    i++;
                    continue;
                }
                return false;
            }
        }else{
            int i = 0;
            while(i+1<nums.length){
                if(nums[i]<=nums[i+1]){
                    i++;
                    continue;
                }
                return false;
            }
        }
        return true;
    }
}