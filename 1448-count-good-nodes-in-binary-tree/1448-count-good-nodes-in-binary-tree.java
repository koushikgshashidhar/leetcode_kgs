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
    public int goodNodes(TreeNode root) {
        
      return  parse(root.val,root.left)+parse(root.val,root.right)+1;
        
    }
    
    int parse(int max,TreeNode root)
    {
        if(root==null)return 0;
        if(max<=root.val)
        {
            max= Math.max(max,root.val);
            return parse(max,root.left)+parse(max,root.right)+1;
        }
        
        return parse(max,root.left)+parse(max,root.right);
    }
}