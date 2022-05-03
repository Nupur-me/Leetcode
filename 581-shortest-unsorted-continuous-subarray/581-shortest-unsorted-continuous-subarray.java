class Solution {
    public int findUnsortedSubarray(int[] nums) {
 
        int[] copy = nums.clone();
        Arrays.sort(copy);
        int start = 0;
        int end = nums.length-1;
        
        for(; start<nums.length;start++){
            if(nums[start] != copy[start]) break;
            else{
                if(start>=nums.length-1){
                    return 0;
                }
            }
        }
        
        for(; end>0;end--){
            if(nums[end] != copy[end]) break;
        }
        
        int ans = end-start+1;
        return ans;
        
    }
}