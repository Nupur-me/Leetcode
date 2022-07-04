class Solution {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int sum = 0;
        for(int x:nums) sum+=x;
       for(int i = 0;i<nums.length;i++){
            if(left*2==sum-nums[i]){
                return i;
            }
           left += nums[i];
        }
        return -1;
    }
}