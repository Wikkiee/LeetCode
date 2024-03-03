class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList();
        for(String ops: operations){
            if(ops.equals("C")){
                list.remove(list.size()-1);
            }else if(ops.equals("D")){
                list.add(list.get(list.size()-1)*2);
            }else if(ops.equals("+")){
                list.add(list.get(list.size()-1) + list.get(list.size()-2));
            }else{
                list.add(Integer.valueOf(ops));
            }
        }
        int sum = 0;
        for(int n : list){
            sum += n;
        }
        return sum;
    }
}