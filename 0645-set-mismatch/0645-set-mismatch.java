class Solution {
    public int[] findErrorNums(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap();
        for(int num :nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int missing_number = 0;
        for(int i = 1;i<=nums.length;i++){
            if(!map.containsKey(i)){
                missing_number = i;
            }
        }
        int[] res = new int[2];
        for(int num : nums){
            if(map.get(num)>1){
                res[0] =  num;
                res[1] = missing_number;
                return res;
            }
        }
        System.out.println(missing_number);
        return nums;
    }
}