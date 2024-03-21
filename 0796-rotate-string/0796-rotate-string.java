class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length() < goal.length() || goal.length()<s.length()){
            return  false;
        }
        s = s+s;
        int i = 0,j = goal.length();
        while(i<goal.length()){
            if(s.substring(i,j).equals(goal)){
                return true;
            }
            i++;j++;
        }
        return false;
    }
}