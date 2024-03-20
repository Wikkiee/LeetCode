class Solution {
    public boolean checkRecord(String s) {
        int absent = 0;
        int late = 0;
        int present = 0;
        int i = 0;
        while(i<s.length()){
           if(s.charAt(i) == 'A'){
                absent++;
                if(absent>=2){
                    return false;
                }
                i++;
            }else if(s.charAt(i)== 'L'){
                while(i<s.length() && s.charAt(i)=='L'){
                    i++;
                    late++;
                    if(late>=3){
                        return false;
                    }
                }
                late = 0;
            }else{
                present++;
                i++;
            }
        }
        
        return true;
    }
}