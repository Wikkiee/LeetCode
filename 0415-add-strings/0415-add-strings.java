class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        String sum = "";
        while(i>=0|| j>=0){
            int digi = 0 + carry;
            if(i>=0){
                digi += num1.charAt(i) - '0';
                i--; 
            }
            if(j>=0){
                digi += num2.charAt(j) - '0';
                j--; 
            }
            
            sum = digi%10 + sum;
            carry = digi/10;
        }
        if(carry == 1){
            sum = carry+ sum;
        }
        
        return sum;
    }
}