class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        
        HashMap<String, Integer> map1 = new HashMap<>();
        List<String> val = new ArrayList<>();
        int minIndexSum = Integer.MAX_VALUE;

        for (int i = 0; i < list1.length; i++) {
            map1.put(list1[i], i);
        }

        for (int j = 0; j < list2.length; j++) {
            if (map1.containsKey(list2[j])) {
                int currentIndexSum = j + map1.get(list2[j]);

                if (currentIndexSum < minIndexSum) {
                    minIndexSum = currentIndexSum;
                    val.clear();
                    val.add(list2[j]);
                } else if (currentIndexSum == minIndexSum) {
                    val.add(list2[j]);
                }
            }
        }
        return val.toArray(new String[0]);
    }
}
        
        
        
        
        
        
        
//         List<Pair<Integer,Pair<Integer,Integer>>> temp = new ArrayList();
//         int i = 0;
//         int min = Integer.MAX_VALUE;
//         while(i<list1.length){
//             int j = 0;
//             while(j<list2.length){
//                 if(list1[i].equals(list2[j])){
//                    if((i+j)<min){
//                         temp.add(new Pair(i+j,new Pair(i,j)));
//                    } 
//                 }
//                 j++;
//             }
//             i++;
//         }

//         for(Pair<Integer,Pair<Integer,Integer>> item : temp){
//             min = Math.min(item.getKey(),min);
//         }
//         List<String> li = new ArrayList();
//         for(Pair<Integer,Pair<Integer,Integer>> item : temp){
//             if(item.getKey() == min){
//                 li.add(list1[item.getValue().getKey()]);
//             }
//         }
//         String[] res = new String[li.size()];
//         for(int x = 0;x<li.size();x++){
//             res[x] = li.get(x); 
//         }
        
//         return res;
//     }
// }}