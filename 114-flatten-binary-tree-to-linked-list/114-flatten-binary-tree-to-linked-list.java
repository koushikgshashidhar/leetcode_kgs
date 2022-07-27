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

//First way using recursion TC:o(n) with auxillary stack space o(n)
// class Solution {
//      TreeNode prev=null;
//     public void flatten(TreeNode root) {
//         if(root ==null) return;

//         flatten(root.right);
//         flatten(root.left);

//         root.right=prev;
//         root.left=null;
//         prev=root;    
//     }
// }

//second way using Iterative way TC:o(n) with O(n) stack
// class Solution {
// 
//     public void flatten(TreeNode root) {
        
//         if(root==null)return;
//         Stack<TreeNode> st= new Stack<TreeNode>();
//         st.add(root);
//         while(!st.isEmpty())
//         {
//             TreeNode cur=st.pop();
            
//             if(cur.right!=null)st.push(cur.right);
//             if(cur.left!=null)st.push(cur.left);
            
//             cur.left=null;
//             if(!st.isEmpty())
//             cur.right=st.peek();
//         }
        
//     }
// }

//Third Way Morris traversal
class Solution {

    public void flatten(TreeNode root) {
         
        TreeNode cur=root;
        while(cur!=null)
        {
            
            if(cur.left!=null)
            { TreeNode prev=cur.left;
            
            TreeNode temp=prev;
            while(temp.right!=null)
                temp=temp.right;
            
            
            temp.right=cur.right;
            cur.right=prev;
             cur.left=null;
            }
            
            cur=cur.right; 
        }

    }
}
        


