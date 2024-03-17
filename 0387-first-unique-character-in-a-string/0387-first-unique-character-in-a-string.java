class Solution {
    public int firstUniqChar(String s) {
        char[] sArr = s.toCharArray();
        int[] res = new int[26];
        for(char c : sArr){
            res[c-'a'] += 1;
        }
        for(int i = 0;i<sArr.length;i++){
            if(res[sArr[i]-'a'] == 1){
                return i;
            }
        }
        return -1;
        // for(int i = 0;i<sArr.length-1;i++){
        //     boolean isDup = false;
        //     for(int j = i+1;j<sArr.length;j++){

        //         if(sArr[i] == sArr[j]){
        //             sArr[j] = '0';
        //             isDup = true;
        //         }
        //     }
        //     if(isDup){
        //         sArr[i] = '0';
        //     }
        // }
        // for(int i = 0;i<sArr.length;i++){
        //     if(sArr[i] != '0'){
        //         return i;
        //     }
        // }
        // return -1;
    }
}