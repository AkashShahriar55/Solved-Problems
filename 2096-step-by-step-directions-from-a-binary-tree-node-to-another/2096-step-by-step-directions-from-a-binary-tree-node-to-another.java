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
    
    
    String startValuePath = "";
    String destValuePath = "";
    StringBuilder path = new StringBuilder();
    
    public String getDirections(TreeNode root, int startValue, int destValue) {
        
        traverseTree(root,startValue,destValue);
        
        
        
        int samePath = 0;
        
        while(samePath < startValuePath.length() && samePath < destValuePath.length()){
            if(startValuePath.charAt(samePath) == destValuePath.charAt(samePath)){
                samePath++;
            }else{
                break;
            }
        }
        
        StringBuilder ans = new StringBuilder();
        
        for(int i = samePath; i<startValuePath.length();i++){
            ans.append("U");
        }
        
        for(int i = samePath; i<destValuePath.length();i++){
            ans.append(destValuePath.charAt(i));
        }
        
        return ans.toString();
    }
    
    
    
    private void traverseTree(TreeNode root,int startValue,int destValue){
        if(root == null)
            return;
        
        // System.out.println(root.val+" " + path);
        
        if(startValue == root.val)
            startValuePath = path.toString();
        
        if(destValue == root.val)
            destValuePath = path.toString();
        
        if(!startValuePath.isEmpty() && !destValuePath.isEmpty())
            return;
        
        path.append("L");
        traverseTree(root.left,startValue,destValue);
        path.deleteCharAt(path.length()-1);
        path.append("R");
        traverseTree(root.right,startValue,destValue);
        path.deleteCharAt(path.length()-1);
        
    }
    
    
    
    
    
    
}