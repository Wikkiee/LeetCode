class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet();
        int res = 0;
        int limit =0;

        for(int n:candyType){
            if(limit == (candyType.length/2) ){
                break;
            }
            if(!set.contains(n)){
                res++;
                set.add(n);
                limit++;
            }
            
        }
        return res;
    }
}