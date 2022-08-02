class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        
        
        
        //Brute Force
         int n = matrix.length;
        int [] arr = new int[n*n];
        int idx = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n;j++){
                arr[idx++] = matrix[i][j];
            }
        }
        
        Arrays.sort(arr);
        
        return arr[k - 1];
//         // 2nd Method TC:O(n*logk)
//         PriorityQueue<Integer>  hp= new PriorityQueue<Integer>(Collections.reverseOrder());
//         for(int i=0;i<matrix.length;i++)
//         {
            
//             for(int j=0;j<matrix[i].length;j++)
//             {
//                 hp.add(matrix[i][j]);
//                 if(hp.size()>k)
//                 hp.poll();      
//             }
//         }
//         System.out.println(hp.size());
//         return hp.peek();
    }
}