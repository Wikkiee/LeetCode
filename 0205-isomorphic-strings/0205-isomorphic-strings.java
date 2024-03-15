class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mp = new HashMap();
        HashMap<Character,Character> mp1 = new HashMap();
        if(s.length() != t.length()){
            return false;
        }

        for(int i = 0;i<s.length();i++){
            if(mp.containsKey(s.charAt(i)) && mp.get(s.charAt(i)) == t.charAt(i)){
                continue;
            }else if(mp.containsKey(s.charAt(i)) && mp.get(s.charAt(i)) != t.charAt(i)){
                    System.out.println("false 1");
                    return false;
            }else if(mp1.containsKey(t.charAt(i)) && mp1.get(t.charAt(i)) != s.charAt(i)){
                return false;
            }else{
                mp.put(s.charAt(i),t.charAt(i));
                mp1.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;

    }
}