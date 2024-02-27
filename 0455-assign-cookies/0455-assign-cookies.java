class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int i = 0,j=0,content = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        while(i<g.length && j<s.length){
            if(s[j]>=g[i]){
                content++;
                i++;
                j++;
            }else{
                j++;
            }
        }
        return content;
    }
}