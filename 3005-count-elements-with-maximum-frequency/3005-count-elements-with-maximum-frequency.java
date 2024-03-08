class Solution {
    public int maxFrequencyElements(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap();
        for(int n:nums){
            map.put(n,map.getOrDefault(n,0)+1);
            
        }

        int max = 1;
        for(int i = 0;i<nums.length;i++){
            max = Math.max(map.get(nums[i]),max);
        }
        int sum = 0;
        System.out.println(max);
        for(int n : map.keySet()){

            if(max == map.get(n)){
                sum++;
            }
        }
        
        System.out.println(sum);
        return max*sum;
    }
}