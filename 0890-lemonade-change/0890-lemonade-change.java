class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map = new HashMap();
        
        for(int bill:bills){
                if(bill == 5){
                    map.put(bill,map.getOrDefault(bill,0)+1);
                }else if(bill == 10){
                    map.put(bill,map.getOrDefault(bill,0)+1);
                    if(map.getOrDefault(5,0)>=1){
                        map.put(5,map.get(5)-1);
                    }else{
                        return false;
                    }
                }else if(bill == 20){
                    map.put(bill,map.getOrDefault(bill,0)+1);
                    if( ( map.getOrDefault(5,0)>=1 && map.getOrDefault(10,0)>=1) ){
                        map.put(5,map.get(5)-1);
                        map.put(10,map.get(10)-1);
                    }else if((map.getOrDefault(5,0)>=3)){
                        map.put(5,map.get(5)-3);
                    }else{
                        return false;
                    }
            }

        }
        return true;
    }
}