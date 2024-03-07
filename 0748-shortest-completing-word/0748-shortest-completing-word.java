class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        
        int[] licensePlateArray = new int[26];
        for(char c: licensePlate.toCharArray()){
            if(Character.isAlphabetic(c)){
                licensePlateArray[Character.toLowerCase(c)-'a']++;
            }
        }
        String ans = null;
        for(String s : words){
            int[] sArray =  new int[26];
            for(char ch : s.toCharArray()){
                sArray[(Character.toLowerCase(ch))-'a']++;
            }
            boolean exist = true;
            for(int i = 0;i<=25;i++){
                if(sArray[i]<licensePlateArray[i]){
                    exist = false;
                    break;
                }
            }
            if(exist){
                ans = ((ans==null|| s.length() < ans.length())?s:ans);
            }
    
        }
        return ans;
    }
}