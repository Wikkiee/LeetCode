class Solution {
    public String maximumOddBinaryNumber(String s) {
        char[] charArray = s.toCharArray();
        int numberOfOnes = -1;
        int temp[] = new int[s.length()];
        for(char c : charArray){
            if(c == '1' ){
                if(numberOfOnes==-1){
                    temp[s.length()-1] = 1;
                    numberOfOnes=0;
                }else{
                    temp[numberOfOnes] = 1;
                    numberOfOnes++;
                }
            }
        }
        String res = "";
        for(int nu:temp){
            res+=nu;
        }
        return res;
    }
}