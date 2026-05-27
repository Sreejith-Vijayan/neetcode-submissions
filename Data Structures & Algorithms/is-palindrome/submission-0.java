class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]" , "");
        String cleanString = s.toLowerCase();
        char[] stringArray = new char[cleanString.length()];
        stringArray = cleanString.toCharArray();
        int i = 0;
        int j = cleanString.length() - 1;
        while(i < j){
            if(stringArray[i] != stringArray[j]){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}