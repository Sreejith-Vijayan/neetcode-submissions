class Solution {
    public String mergeAlternately(String word1, String word2) {
        word1 = word1 + "*";
        word2 = word2 + "*";
        int n = Math.min(word1.length() , word2.length());
        String ans = "";
        int i;
        for(i = 0 ; i<n ; i++){
            if(word1.charAt(i) != '*' && word2.charAt(i) != '*'){
                ans = ans + word1.charAt(i) + word2.charAt(i);
            }
            if(word1.charAt(i) == '*' || word2.charAt(i) == '*'){
                break;
            }
        }
        if(word1.charAt(i) == '*'){
            while(i < word2.length() && word2.charAt(i) != '*'){
                ans = ans + word2.charAt(i);
                i++;
            }
        }
        if(word2.charAt(i) == '*'){
            while(i < word1.length() && word1.charAt(i) != '*'){
                ans = ans + word1.charAt(i);
                i++;
            }
        }
        return ans;
    }
}