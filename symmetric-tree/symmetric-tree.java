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
    public boolean isSymmetric(TreeNode root) {
        return recursionSymmetric(root.left,root.right);
    }
    
    
    private boolean recursionSymmetric(TreeNode one , TreeNode two){
        if((one == null && two != null) || (one != null && two == null))
            return false;
        
        if(one == null && two == null)
            return true;
        
        if(one.val != two.val)
            return false;
        
        boolean left = recursionSymmetric(one.left,two.right);
        boolean right = recursionSymmetric(one.right,two.left);
        
      
        
        return left && right;
        
    }
}