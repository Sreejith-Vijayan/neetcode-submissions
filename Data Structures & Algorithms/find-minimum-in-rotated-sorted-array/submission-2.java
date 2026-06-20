class Solution {
    public int findMin(int[] nums) {
        int leftMin = nums[0];
        int j = nums.length - 1;
        if(nums[0] <= nums[nums.length - 1]) {
            return nums[0];
        }
        else{
            while(nums[j] < leftMin) {
                j--;
            }
        }
        return nums[j + 1];
    }
}
