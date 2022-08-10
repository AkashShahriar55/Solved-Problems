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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList();

        if(root == null)
            return list;


        Stack<TreeNode> queue = new Stack<>();

        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.pop();

            if(node == null)
                continue;

            list.add(node.val);

            if(node.right != null)
                queue.add(node.right);

            if(node.left != null)
                queue.add(node.left);
        }



        return list;
        
        
        
    }
}