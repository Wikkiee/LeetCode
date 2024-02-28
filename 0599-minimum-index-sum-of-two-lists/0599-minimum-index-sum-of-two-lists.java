class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        List<Pair<Integer,Pair<Integer,Integer>>> temp = new ArrayList();
        int i = 0;
        int min = Integer.MAX_VALUE;
        while(i<list1.length){
            int j = 0;
            while(j<list2.length){
                if(list1[i].equals(list2[j])){
                   if((i+j)<min){
                        temp.add(new Pair(i+j,new Pair(i,j)));
                   } 
                }
                j++;
            }
            i++;
        }

        for(Pair<Integer,Pair<Integer,Integer>> item : temp){
            min = Math.min(item.getKey(),min);
        }
        List<String> li = new ArrayList();
        for(Pair<Integer,Pair<Integer,Integer>> item : temp){
            if(item.getKey() == min){
                li.add(list1[item.getValue().getKey()]);
            }
        }
        String[] res = new String[li.size()];
        for(int x = 0;x<li.size();x++){
            res[x] = li.get(x); 
        }
        
        return res;
    }
}