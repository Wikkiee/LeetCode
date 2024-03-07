class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int lines = 1;
        int counter = 0;
        char lc = 'a';
        int i = 0;
        while(i<s.length()){

            int n = s.charAt(i) - 'a';
            if( (counter + widths[n])<= 100){
                counter += widths[n];
                i++;
                
            }else{
                lines++;
                counter = 0;
                
            }
        }
        return new int[]{lines,counter};
    }
}