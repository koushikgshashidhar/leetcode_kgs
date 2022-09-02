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
  
    public List<Double> averageOfLevels(TreeNode root) {
        
          List<Double> res=new ArrayList<Double>();
        Queue<TreeNode> q= new ArrayDeque<TreeNode>();  
        q.add(root);
        res.add(root.val*1d);
        while(!q.isEmpty())
        {
            
        double sum=0;
            int size=q.size();
            int x=0;
            for(int i=0;i<size;i++)
            {
                TreeNode temp=q.poll();
                
                if(temp.left!=null)
                {
                    sum+=temp.left.val;
                        q.add(temp.left);
                    x++;
                }  
                 if(temp.right!=null)
                {
                    sum+=temp.right.val;
                    q.add(temp.right);
                     x++;
                }  
                
                    
                
            }
            
            if(x!=0)
            res.add(sum/x);
            
            
        }
        
        return res;
        
    }
}