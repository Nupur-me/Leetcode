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
class Solution{
public boolean isSymmetric(TreeNode root) {
    
    if(root == null) return true;
    
    Stack<TreeNode> output = new Stack<>();
    output.push(root.left);
    output.push(root.right);
    
    while(!output.empty()){
    TreeNode n1 = output.pop();
    TreeNode n2 = output.pop();
    
    if (n1 == null && n2 == null) continue;
    if(n1 == null || n2 == null || n1.val!=n2.val) return false;
    
    output.push(n1.left);
    output.push(n2.right);
    output.push(n1.right);
    output.push(n2.left);
    }
    return true;
    
}
    
}