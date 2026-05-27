class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        int n = nums.length/2;
        int result = 0;
        for(int num : nums){
            hm.put(num , hm.getOrDefault(num , 0) + 1);
            if(hm.get(num) > n){
                result = num;
            }
        }

        return result;
    }
}