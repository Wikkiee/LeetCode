class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length < 2){
            return nums;
        }
        int start = 0,end = nums.length-1,i=0;
        int[] res = new int[nums.length];
      
        while(i<nums.length){
            if(nums[i]%2==0){
                res[start++] = nums[i];
            }else{
                res[end--] = nums[i];
            }
            i++;
        }
        return res;
    }
}