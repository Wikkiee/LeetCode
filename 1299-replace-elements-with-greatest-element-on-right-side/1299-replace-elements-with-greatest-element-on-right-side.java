class Solution {
    public int[] replaceElements(int[] arr) {
        List<Integer> list = new ArrayList();
        for(int i = 0;i<arr.length;i++){
            int maxNum = 0;
            for(int j = i+1;j<arr.length;j++){
                maxNum = Math.max(maxNum,arr[j]);
            }
            if(i == arr.length-1){
                list.add(-1);
            }else{
             list.add(maxNum);   
            }
            
        }
        int[] res = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            res[i] = list.get(i);
        }
        return res;
    }
}