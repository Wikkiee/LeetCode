class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int maxLength = 1;
        int currentLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }

            maxLength = Math.max(maxLength, currentLength);
        }

        return maxLength;
        
        
        
        
        
        // List<Integer> l = new ArrayList();
        // int c= 0;
        // int max = 0;
        // for(int i = 0; i<nums.length;i++){
        //     int n = nums[i];
        //         if(n>max || (i == nums.length-1 && nums[i]>max)){
        //                     System.out.println(n);
        //             max = n;
        //             c++;   
        //         }else{
        //             l.add(c);
        //             c=1;
        //             max = n;
        //         }
        // }
        // l.add(c);
        // System.out.println(l);
        // max = 0;
        // for(int n : l){
        //     max = Math.max(max,n);
        // }
        // return max;
    }
}