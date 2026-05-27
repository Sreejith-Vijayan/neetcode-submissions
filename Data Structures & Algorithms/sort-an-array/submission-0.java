class Solution {
    public int[] sortArray(int[] nums) {
        for(int i = 0 ; i<nums.length ; i++){
            for(int j = 0 ; j<=nums.length-1 ; j++){
                for(int k = j+1 ; k<nums.length ; k++){
                    if(nums[k] < nums[j]){
                        int temp = nums[k];
                        nums[k] = nums[j];
                        nums[j] = temp;
                    }
                }
            }
        }
        return nums;
    }
}