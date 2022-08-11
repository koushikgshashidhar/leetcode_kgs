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
    ArrayList<Integer> al = new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        
        intraverse(root);
        for(int i=1;i<al.size();i++)
        {
            if(al.get(i)<=al.get(i-1))
                return false;
                
        }
        return true;
        
    }
    void intraverse(TreeNode root)
    {
        if(root==null)return;
        intraverse(root.left);
        al.add(root.val);
        intraverse(root.right);
    }
}