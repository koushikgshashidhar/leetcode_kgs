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
    public int sumOfLeftLeaves(TreeNode root) {
        
       return traverse(root ,1);
    }
    
    int traverse(TreeNode root,int x)
    {
        if(root==null)return 0;
        if(root.left== null && root.right==null)
        {
            if(x==0)
                return root.val;
        }
        
        return traverse(root.left,0)+traverse(root.right,1);
    }
}