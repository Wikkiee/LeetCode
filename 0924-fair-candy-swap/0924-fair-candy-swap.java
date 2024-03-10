class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int diff = ((getSum(aliceSizes)-getSum(bobSizes))/2);
        System.out.println(diff);
        HashSet<Integer> set = new HashSet();
        for(int n: aliceSizes) set.add(n);
        for(int n: bobSizes){
            if(set.contains(n+diff)){
                return new int[]{n+diff,n};
            }
        }
        return new int[]{1,2};
        
    }

    public int getSum(int[] ar){
        int sum = 0;
        for(int n : ar){
            sum += n;
        }
        return sum;
    }





}