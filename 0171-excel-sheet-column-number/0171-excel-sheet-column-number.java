class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character,Integer> mp= new HashMap();
        for(int i = 0;i<26l;i++){
            mp.put((char) (65+i),i+1);
        }
        int len = columnTitle.length();
        int res = 0;
        for(char c : columnTitle.toCharArray()){
            len = len - 1;
            res = res + ( (int) (mp.get(c) * (Math.pow(26,len))) );

        }
        return res;
    }
}