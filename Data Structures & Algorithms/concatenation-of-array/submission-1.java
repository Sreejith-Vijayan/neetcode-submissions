
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for(int i = 0 ; i<nums.length ; i++){
            ans[i] = nums[i];
        }
        for(int j = n, i = 0; j < (2 * n); i++, j++){
            ans[j] = nums[i];
        }
        return ans;
    }
}