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
    
    int max_depth = 1;
    
    public int maxDepth(TreeNode root) {
        return recursionDepth(root,max_depth);
    }
    
    
    private int recursionDepth(TreeNode root,int depth){
        if(root == null)
            return depth-1;
        
        int left = recursionDepth(root.left,depth+1);
        int right = recursionDepth(root.right,depth+1);
        
        return Math.max(left,right);
    }
}