/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        
      TreeNode head =  formBST(nums,  0, nums.length-1); 
        return head;
    }
    
    public TreeNode formBST(int[] nums, int start, int end){
        
        if(end<start) return null;
       int mid = start + (end - start)/2;
        TreeNode node = new TreeNode(nums[mid]);
        node.left = formBST(nums, start, mid-1);
        node.right = formBST(nums,mid+1,end);
        return node;        
    }
}