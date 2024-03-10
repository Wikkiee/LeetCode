class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {



        HashMap<Integer,Integer> map = new HashMap();
        int index = 0;
        for(int n1: nums1){
            for(int n2:nums2){
                if(n1 == n2 && !map.containsKey(n1)){
                    map.put(n1,index++);
                }
            }
        }
        int[] res = new int[map.size()];
        for(Map.Entry<Integer,Integer> num:map.entrySet()){
            res[num.getValue()] = num.getKey();
        }
        return res;

//         HashSet<Integer> set = new HashSet();
//         int index = 0;
//         for(int n1: nums1){
//             for(int n2:nums2){
//                 if(n1 == n2 ){
//                     set.add(n1);
//                 }
//             }
//         }
//         int[] res = new int[set.size()];
//         index = 0;
//         Iterator<Integer> i = set.iterator();
//         while(i.hasNext()){
//             res[index] = i.next();
//             index++;
//         }
//         return res;
    }

}