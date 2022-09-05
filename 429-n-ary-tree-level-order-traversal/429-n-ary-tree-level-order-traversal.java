/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        
        Queue<Node> q= new ArrayDeque<Node>();
        
        List<List<Integer>> res= new ArrayList<>();
        if(root!=null)
        q.add(root);
        
        while(!q.isEmpty())
        {
            int size=q.size();
            List<Integer> l= new ArrayList<Integer>();
            for(int i=0;i<size;i++)
            {
                
                Node temp=q.poll();
                    l.add(temp.val);
                
                for(Node a:temp.children)
                {
                    q.add(a); 
                    
                }
                
                
            }
            //System.out.println(l);
            res.add(l);
            
                
        }
        
        
        return res;
        
    }
}