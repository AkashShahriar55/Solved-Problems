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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> answer = new ArrayList<>();

        if(root == null)
            return answer;

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        
        int level = 0;

        while (!queue.isEmpty()){
            level++;
            int nodeCount = queue.size();
            List<Integer> levelAns = new ArrayList<>();
            for(int i = 0; i< nodeCount; i++){
                TreeNode node = queue.poll();
                levelAns.add(node.val);
                
                if(node.left != null)
                    queue.add(node.left);
                
                if(node.right != null)
                    queue.add(node.right);
                
                
            }
            answer.add(levelAns);
        }
        
        return answer;
    }
}