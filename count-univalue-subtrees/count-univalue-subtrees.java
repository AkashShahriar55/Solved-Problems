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
    
    int count = 0;
    
    public int countUnivalSubtrees(TreeNode root) {
        if(root != null)
            countRecursion(root);
        return count;
    }
    
    
    private int countRecursion(TreeNode node){
        
        boolean allEqual = true;
        
        if(node.right == null && node.left == null){
            count++;
            return node.val;
        }
        
        
        if(node.left != null){
            int left = countRecursion(node.left);
            allEqual = allEqual && (node.val == left);
        }
        
        if(node.right != null){
            int right = countRecursion(node.right);
            allEqual = allEqual && (node.val == right);
        }
        
        // System.out.println(allEqual);
        
        if(allEqual){
            count++;
            return node.val;
        }
        
        
        return 1001;
        
        
    }
    
    
    
    
    
}