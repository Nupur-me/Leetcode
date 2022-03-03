class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length<2){
            return 0;
        }
        
           int slices = 0;
           int prev = 0;
    
	           for (int i = 2; i < nums.length; i++){
                   if (nums[i] - nums[i - 1] == nums[i - 1] - nums[i - 2]) {
	                    prev = prev + 1;
	                    slices = slices + prev;
}                  else {
	               prev = 0;
                   }
               }
		
	return slices;      
        
    }
}