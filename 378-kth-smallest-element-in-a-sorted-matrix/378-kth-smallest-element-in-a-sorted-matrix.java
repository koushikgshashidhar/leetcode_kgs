class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        PriorityQueue<Integer>  hp= new PriorityQueue<Integer>(Collections.reverseOrder());
//         {
            
//             public int compare(Integer A,Integer B)
//             {
//                 return A-B;
//             }
//         };
        
        
        for(int i=0;i<matrix.length;i++)
        {
            
            for(int j=0;j<matrix[i].length;j++)
            {
                
                hp.add(matrix[i][j]);
                System.out.println(hp.size());
                if(hp.size()>k)
                    System.out.println(hp.poll());
                
            }
        }
        System.out.println(hp.size());
        return hp.peek();
    }
}