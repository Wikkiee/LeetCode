class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] rArr = ransomNote.toCharArray();
        char[] mArr = magazine.toCharArray();


        for(int i = 0;i<mArr.length;i++){
            for(int j = 0;j<rArr.length;j++){
            if( rArr[j] == mArr[i]){
                rArr[j] = '0';
                mArr[i] = '1';
            }
            }
        }
        for(char c : rArr){
            if(c != '0' ){
                return false;
            }
        }
        return true;
    }
}