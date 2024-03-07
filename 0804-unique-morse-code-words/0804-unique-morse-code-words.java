class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String[] morseCode = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashMap<Character,String> morseCodeMap = new HashMap();
        for(int i = 0;i<26;i++){
            char c = (char)('a' + i);
            morseCodeMap.put(c,morseCode[i]);
            
        }
        
        HashSet<String> set = new HashSet(); 
        for(String word : words){
            String res = "";
            for(char c: word.toCharArray()){
                res = res + morseCodeMap.get(c);    
            }    
            set.add(res);
        }    
        return set.size();
    }
}