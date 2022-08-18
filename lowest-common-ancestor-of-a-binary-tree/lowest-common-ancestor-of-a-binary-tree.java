/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    
    TreeNode ans = null;
    
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        recursion(root,p,q);
        
        return ans;
    }
    
    
    
    private boolean recursion(TreeNode root,TreeNode p, TreeNode q){
        
        boolean hasTarget = false;
        
        if(root == null)
            return false;
        
        boolean right = recursion(root.left,p,q);
        boolean left = recursion(root.right,p,q);
        
        if(root == p || root == q)
            hasTarget = true;
        
        
        // System.out.println(root.val + " " + hasTarget + " " + right + " " + left);
        
        
        if((right && left) || (right && hasTarget) || (left && hasTarget) )
            ans = root;
        
        
        return hasTarget || left || right;
    }
}