// class MyCalendar {

//         ArrayList<ArrayList<Integer>> al;
//     public MyCalendar() {
        
//         al = new ArrayList<ArrayList<Integer>>();
//     }
    
//     public boolean book(int start, int end) {
        
//         if(al.size()==0)
//         {
//             al.add(new ArrayList(Arrays.asList(start,end)));
            
//         }
//         else
//         {
//             for(int i=0;i<al.size();i++)
//             {
                
//                  // System.out.println(al.get(i).get(0) +" "+end +" "+ al.get(i).get(1)+" "+start);
//                 if((al.get(i).get(0)<end  && al.get(i).get(1)>start))
//                     return false;
            
//             }
            
//             al.add(new ArrayList(Arrays.asList(start,end)));
//         }
//         return true;
//     }
// }

class Node{
    int start,end;
    Node left;
    Node right;
    public Node(int start , int end){
        this.start=start;
        this.end=end;
        left=null;
        right=null;
    }
}

class MyCalendar {
    
    Node root ;
    

    public MyCalendar() {
        this.root = null;
        
    }
    
    public boolean insert(Node parent , int s , int e){
        if (parent.start>=e){
            if(parent.left==null){
                parent.left=new Node(s,e);
                return true;
            }
            else{
                return insert(parent.left,s,e);
            }
        }
        else if (parent.end<=s){
            if(parent.right==null){
                parent.right=new Node(s,e);
                return true;
            }
            else{
                return insert(parent.right,s,e);
            }
        }
        
            return false;
    }
    
    public boolean book(int start, int end) {
        if(root == null){
            root= new Node(start,end);
            return true;
        }
        else{
            return insert(root,start,end);
        }
        
        
        
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */