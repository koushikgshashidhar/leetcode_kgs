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
/*
1st method
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
*/

class Solution {

    public boolean isValidBST(TreeNode root) {
        
       
        return validateNode(Long.MIN_VALUE,Long.MAX_VALUE,root);
        
    }
    
    boolean validateNode(long min,long max,TreeNode node)
    {
        if(node==null)return true;
        if(min>=node.val || node.val>=max)
        {
            return false;
        }
        
        return validateNode(min,node.val*1l,node.left) &&validateNode(node.val*1l,max,node.right);
    }
    
    
}