class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        Set<Integer> ansWithoutDupe = new HashSet<>();

        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) +1);
            if(hm.get(nums[i]) > (nums.length/3)){
                ansWithoutDupe.add(nums[i]);
            }
        }
        
        List<Integer> ansList = new ArrayList<>(ansWithoutDupe);
        return ansList;
    }
}