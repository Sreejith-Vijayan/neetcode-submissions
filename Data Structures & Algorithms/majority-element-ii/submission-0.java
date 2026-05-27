class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer , Integer> hm = new HashMap<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0 ; i < nums.length ; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i] , 0) +1);
            if(hm.get(nums[i]) > (nums.length/3)){
                ans.add(nums[i]);
            }
        }
        Set<Integer> ansWithoutDupe = new HashSet<>(ans);
        List<Integer> ansList = new ArrayList<>(ansWithoutDupe);
        return ansList;
    }
}