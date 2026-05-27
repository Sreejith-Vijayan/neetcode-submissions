class Solution {
    public int firstMissingPositive(int[] nums) {
        int val;
        for(int i = 0 ; i <nums.length ; i++){
            if(nums[i]<0){
                nums[i] = 0;
            }
        }

        for(int i = 0 ; i<nums.length ; i++){
            val = Math.abs(nums[i]);
            if(1 <= val && val <= nums.length){
                val = Math.abs(nums[i]);

                if(nums[val - 1] > 0){
                    nums[val - 1] *= -1;
                }

                else if(nums[val - 1] == 0){
                    nums[val - 1] = -1 * (nums.length + 1);
                } 
            }
        }

        for(int i = 1 ; i<(nums.length+1) ; i++){
            if(nums[i - 1] >= 0){
                return i;
            }
        }
        return nums.length+1;
    }
}