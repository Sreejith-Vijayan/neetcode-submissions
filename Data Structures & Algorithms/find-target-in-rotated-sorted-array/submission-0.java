class Solution {
    public int search(int[] nums, int target) {
        int l = 0 ; 
        int r = nums.length - 1;
        int m = 0;
        int res = -1;
        while(l <=r ) {
            m = l + (r - l)/2;
            if(nums[m] == target) {
                res = m;
                break;
            }
            if(nums[m] >= nums[l]) {    //left half of mid is sorted

                if( target >= nums[l] && target < nums[m] ) {
                    r = m - 1;
                }
                else{
                    l = m + 1;
                }

            }
            if(nums[m] <= nums[r]) {     //right side of mid is sorted

                if( target <= nums[r] && target > nums[m]) {
                    l = m + 1;
                }
                else {
                    r = m - 1;
                }
            }
        }
        return res;
    }
}
