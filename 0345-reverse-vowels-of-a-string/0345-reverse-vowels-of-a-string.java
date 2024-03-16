class Solution {
    public String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] charArr = s.toCharArray();
        while (i < j) {
            if (checkVowel(charArr[i])) {
                while (i < j) {
                    if (checkVowel(charArr[j])) {
                        char temp = charArr[j];
                        charArr[j] = charArr[i];
                        charArr[i] = temp;
                        j--;
                        break;
                    }
                    j--;
                }
            }
            i++;
        }
        return new String(charArr);
    }

    private Boolean checkVowel(char a) {
        return (a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u'
                || a == 'A' || a == 'E' || a == 'I' || a == 'O'
                || a == 'U') ? true : false;

    }
}