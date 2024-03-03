class Solution {
    public int findLengthOfLCIS(int[] nums) {
        List<Integer> l = new ArrayList();
        int c= 0;
        int max = 0;
        for(int i = 0; i<nums.length;i++){
            int n = nums[i];
                if(n>max || (i == nums.length-1 && nums[i]>max)){
                            System.out.println(n);
                    max = n;
                    c++;   
                }else{
                    l.add(c);
                    c=1;
                    max = n;
                }
        }
        l.add(c);
        System.out.println(l);
        max = 0;
        for(int n : l){
            max = Math.max(max,n);
        }
        return max;
    }
}