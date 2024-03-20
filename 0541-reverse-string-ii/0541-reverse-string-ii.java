class Solution {
    public String reverseStr(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        boolean isForward = false;
        StringBuilder temp = new StringBuilder();
        for(char c : s.toCharArray()){
            
            if(isForward){
                temp = temp.append(c);
            }else{
                temp = temp.insert(0,c);
            }
            
            count++;
            if(count==k){
                sb = sb.append(temp);
                temp = new StringBuilder("");
                isForward = !isForward;
                count = 0;
            }
        }
        sb = sb.append(temp);
    return sb.toString();
    
    }

}