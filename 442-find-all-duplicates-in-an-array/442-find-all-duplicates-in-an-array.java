class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        int length = nums.length;
        HashMap<Integer,Integer> set = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i< length;i++){
            if(set.containsKey(nums[i])){
                list.add(nums[i]);
            }
            
            set.put(nums[i],i);
            
        }
        
        return list;
    }
}
