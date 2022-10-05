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
    public boolean isValidBST(TreeNode root) {
        return recursion(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }
    
    
    private boolean recursion(TreeNode root, long lowerBound , long upperBound){
        if(root == null)
            return true;
        
        if(root.val <= lowerBound || root.val >= upperBound)
            return false;
        
        boolean right = recursion(root.right,root.val,upperBound);
        boolean left = recursion(root.left,lowerBound,root.val);
        
        return right && left;
    }
}