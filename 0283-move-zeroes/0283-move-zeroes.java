class Solution {
    public void moveZeroes(int[] nums) {
        int NonZeroIndex = 0;
        for(int i = 0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[NonZeroIndex] = nums[i];
                NonZeroIndex++;
            }
        }
        while(NonZeroIndex<nums.length){
            nums[NonZeroIndex] = 0;
            NonZeroIndex++;
        }
    }
    
    }
// public void moveZeroes(int[] nums) {
//         int end = nums.length-1;
//         for(int i = 1;i<=nums.length;i++){
//             for(int j = 0;j<nums.length-1;j++){
//                 if(nums[j] == 0){
//                     int temp = nums[j+1];
//                     nums[j+1] = nums[j];
//                     nums[j] = temp;
//                 }
//             }
//             }
//         }