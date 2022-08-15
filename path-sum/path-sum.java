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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null)
            return false;
        return recursion(root,targetSum);
    }
    
    
    private boolean recursion(TreeNode root, int target){
        
        if(root == null)
            return false;
        
        
        if(root.left == null && root.right == null && target-root.val != 0)
            return false;
        
        if(root.left == null && root.right == null  && target-root.val == 0)
            return true;
        
        
        boolean left = recursion(root.left, target - root.val);
        boolean right = recursion(root.right,target - root.val);
        
        // System.out.println(left + " " + right);
        
        return left || right;
        
        
            
    }
}