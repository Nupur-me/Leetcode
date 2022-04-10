class Solution {
    public int maxArea(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        int max = 0;
        
        while(left < right){
            int length = right-left;
            max = Math.max(max,Math.min(height[left],height[right])*length);
                
             if(height[left]<height[right]){
                 left++;
             }  
            else{
                right--;
            }
        }
        
        return max;
    }
}