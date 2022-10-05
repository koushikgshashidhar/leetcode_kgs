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
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        
        if(depth==1)
        {
        TreeNode t1= new TreeNode(val,root,null);
            return t1;
        } 
        addLevel(root,val,depth-1);
        return root;
    }
    
     void addLevel(TreeNode root, int val, int depth)
    {
         
         
        
         if(depth==1)
         {
             if(root!=null)
             {
                 TreeNode t1= new TreeNode(val,root.left,null);
                root.left=t1;
             }
             if(root!=null)
             {
                   TreeNode t2= new TreeNode(val,null,root.right);
                root.right=t2;
             }
             return;
         }
         
         if(root.left!=null)
         addLevel(root.left,val,depth-1);
         if(root.right!=null)
         addLevel(root.right,val,depth-1);    
         
    }
    
}