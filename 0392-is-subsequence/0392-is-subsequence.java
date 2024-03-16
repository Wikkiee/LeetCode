class Solution {
    public boolean isSubsequence(String s, String t) {
        char[] sCharArr =s.toCharArray();
        char[] tCharArr = t.toCharArray();
        if(sCharArr.length==0 ){
            return true;
        }
        int i = 0,j=0;
        while(i<sCharArr.length && j<tCharArr.length){
            if(sCharArr[i] != tCharArr[j]){
                tCharArr[j] = '0';
            }else{
                if(i+1 < sCharArr.length){

                i++;
                }
            }
            j++;
        }
        String res = "";
        for(char c: tCharArr){
            if(c != '0'){
                res += c;
            }
        }
        
        return res.equals(new String(sCharArr));
    }
}