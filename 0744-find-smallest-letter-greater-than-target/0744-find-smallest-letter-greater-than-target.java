class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int t = (int) target;
        for(char c:letters){
            int val = (int) c;
            if(val>t){
                return c;
            }
        }
        return letters[0];
    }
}