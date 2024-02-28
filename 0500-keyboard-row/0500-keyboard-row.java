class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character,Integer> map = new HashMap();
        String[] keyboard = {"qwertyuiop","asdfghjkl","zxcvbnm"};
        for(int i = 0;i<keyboard.length;i++){
            char[] cArray = keyboard[i].toCharArray();
            for(char c:cArray){
                map.put(c,i);
            }
        }
        String[] temp = new String[words.length];
        
        boolean isValid = true;
        int count = 0;
        for(String word:words){
            isValid = true;
            char[] chArray = word.toLowerCase().toCharArray();
            int currentRow = -1;
            for(char cha: chArray){
                if(currentRow == -1 || currentRow == map.get(cha)){

                    currentRow = map.get(cha);
                        continue;
                }else{
    
                    isValid = false;
                    break;
                }
                
            }
            
            if(isValid == true){
                System.out.println("Done");
                temp[count++] = word; 
            }
            
        }
        String[] res = new String[count];
        for(int x = 0;x<count;x++){
            res[x] = temp[x];
        }
        return res;
    }

}