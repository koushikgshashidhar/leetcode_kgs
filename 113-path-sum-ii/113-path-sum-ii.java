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
    List<List<Integer>> res= new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<Integer> al= new ArrayList<Integer>();
        traverseTree(root,0,targetSum,al);
        return res;
        
    }
    void traverseTree(TreeNode root,int no,int sum,List<Integer> al)
    {
     
        if(sum<sum)return;
        
        if(root==null)return;
        
        if(root.left==null && root.right==null && no+root.val==sum)
        {   al.add(root.val);
            res.add(new ArrayList<>(al));
             al.remove(al.size()-1);
        return;
        }
        
        al.add(root.val);
        
        traverseTree(root.left,no+root.val,sum,al);
        
       // al.remove(al.size()-1);
        
        traverseTree(root.right,no+root.val,sum,al);
        
        al.remove(al.size()-1);
        
        
        
    }
}