class Solution {
    public int strStr(String haystack, String needle) {
        int len = haystack.length() - needle.length();
        // if( !(len >= needle.length())) return -1;

        for(int i = 0;i<=len;i++ ){
            if(haystack.substring(i,i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;



        // int p1 = 0;
        // int p2 = 0;
        // char[] hayStackAr = haystack.toCharArray();
        // char[] needleArray = needle.toCharArray();
        // while(p1<hayStackAr.length){
        //     int count = 0;
        //     if(hayStackAr[p1] == needleArray[p2]){
        //         int temp = p1;
        //         count = count + 1;
        //         while((temp+1 < hayStackAr.length && p2+1 <needleArray.length) && hayStackAr[temp+1] == needleArray[p2+1]){
        //             count++;
        //             temp++;
        //             p2++;
        //         }

        //     }
        //     System.out.println(count);
        //     if(count == needleArray.length){
        //         return p1;
        //     }
        //     p1++;
        //     p2 = 0;
        // }
        // return -1;
    }
}