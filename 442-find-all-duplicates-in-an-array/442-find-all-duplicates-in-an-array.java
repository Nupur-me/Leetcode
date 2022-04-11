class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int length = nums.length;
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 1; i< length;i++){
            if(nums[i] == nums[i-1]){
                set.add(nums[i]);
            }
            
        }
        ArrayList<Integer> list = new ArrayList<Integer>(set);
        return list;
    }
}
