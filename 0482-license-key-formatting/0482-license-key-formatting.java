class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String sb = new String();
        int tempK = k;
        int i = s.length()-1;
        while(i>=0){
            char c = s.charAt(i);
            if(c == '-'){
                i--;
                continue;
            }
            if(k==0){
                sb = '-'+sb;
                k=tempK;
            }else{

                    if(c>=97 && c<=122){
                        c = (char) (c - 32);
                    }
                    sb = c + sb;
            
                i--;
                k--;
            }
     
            
        }
        System.out.println(sb);
        return sb;
    }
}