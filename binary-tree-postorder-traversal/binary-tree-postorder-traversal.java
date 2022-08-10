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
    public List<Integer> postorderTraversal(TreeNode root) {
        
        List<Integer> list = new ArrayList();
        Set<TreeNode> visited = new HashSet<>();

        if(root == null)
            return list;


        Stack<TreeNode> queue = new Stack<>();

        queue.add(root);

        while (!queue.isEmpty()){
            TreeNode node = queue.peek();
            visited.add(node);

            if(node.left != null && !visited.contains(node.left)) {
                queue.push(node.left);
            }
            else{
                if(node.right != null && !visited.contains(node.right)){
                    queue.push(node.right);
                }else{
                    list.add(node.val);
                    queue.pop();
                }
            }
        }



        return list;
    }
}