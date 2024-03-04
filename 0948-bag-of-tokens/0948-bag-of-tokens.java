class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int score = 0;
        int maxi = 0;
        int left = 0,right = tokens.length-1;
        Arrays.sort(tokens);
        int counter = 0;
        while(left<=right && counter < tokens.length){
            while( left<=right && power >= tokens[left]){
                power = Math.abs(power-tokens[left]);
                score++;
                left++;
                maxi = Math.max(maxi,score);
            }
            if(score>0){
                power += tokens[right];
                right--;
                score--;
                maxi = Math.max(maxi,score);
            }
            counter++;
        }
        
        System.out.println(maxi);
        return maxi;
    }
}