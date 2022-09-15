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
    int []arr= new int[9];
    int res=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        
        
        dfs(root);
        return res;
    }
    boolean isPalindrome()
    {
        int flag=0;
        for(int i=0;i<9;i++)
        {
            if(arr[i]%2==1)
                flag++;
        }
        if(flag>1)return false;
        return true;
    }
    void dfs(TreeNode root)
    {
        if(root==null)return;
        
        arr[root.val-1]++;
        
        if(root.left==null && root.right==null)
        {
            if(isPalindrome())
                res++;
        }
        else
        {
            dfs(root.left);
            dfs(root.right);
        }
        arr[root.val-1]--;
    }
}