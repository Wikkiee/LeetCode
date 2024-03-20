class Solution {
    public String reverseWords(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        while(i<s.length()){
            char c = s.charAt(i);
            if(c == ' '){
                temp.append(c);
                sb.append(temp);
                temp = new StringBuilder();
            }else{
                temp.insert(0,c);
            }
            i++;
        }
        sb.append(temp);

        return sb.toString();
    }
}