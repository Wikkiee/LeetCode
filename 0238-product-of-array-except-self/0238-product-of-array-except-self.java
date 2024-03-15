class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] ans =  new int[nums.length];
        int count = 0;
        int index = 0;
        int product = 1;
        for(int i = 0;i<ans.length;i++){
            if(nums[i] == 0){
                count++;
                index = i;
                if(count>1){
                    return ans;
                }
            }else{
                product *= nums[i];
            }
        }
        if(count == 1){
            ans[index] = product;
        }else{
            for(int i = 0;i<nums.length;i++){
                ans[i] = product/nums[i];
            }
        }
        return ans;
    }
}