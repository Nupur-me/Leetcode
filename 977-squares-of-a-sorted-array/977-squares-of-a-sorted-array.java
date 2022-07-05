class Solution {
    public int[] sortedSquares(int[] nums) {
        
        int[] ans = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int fill = nums.length-1;
        
        while(i<=j){
            int first = nums[i]*nums[i];
            int last = nums[j]*nums[j];
            if(first>last){
                ans[fill] = first;
                i++;
                 fill--;
            }
            else{
                ans[fill] = last;
                j--;
                 fill--;
            }
           
        }
        
        return ans;
    }
}