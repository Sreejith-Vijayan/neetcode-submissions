class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        char[] countS= s.toCharArray();
        char[] countT= t.toCharArray();

        Arrays.sort(countS);
        Arrays.sort(countT);

        for(int i = 0 ; i<s.length() ; i++){
            if(countS[i] != countT[i]){
                return false;
            }
        }
        return true;
    }
}
