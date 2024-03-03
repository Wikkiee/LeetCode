class Solution {
    public int search(int[] nums, int target) {
        int left = 0,right = nums.length;
        if(nums.length <= 2){
            if(nums[0] == target){
                return 0;
            }else if(nums.length==2 && nums[1] == target){
                return 1;
            }else{
                return -1;
            }
        }
        int counter = 0;
        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid]>target){
                right = mid; 
            }
            if(nums[mid]<target){
                left = mid;
            }
            if(counter == nums.length){
                break;
            }
            counter++;
        }
        return -1;
        
    }
}