class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int length = nums.length;
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i< length;i++){
            if(set.contains(nums[i])){
                list.add(nums[i]);
            }
            
            set.add(nums[i]);
            
        }
        
        return list;
    }
}
