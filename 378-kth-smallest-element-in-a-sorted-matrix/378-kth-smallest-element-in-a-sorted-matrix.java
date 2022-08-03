class Solution {
    int count(int arr[][], int mid)
	{
	    int i=arr.length-1;int j=0;
        int cnt=0;
        while(i>=0 && j<arr[0].length)
        {
            if(arr[i][j]>mid)
                i--;
            else
            {
                cnt+=i+1;
                j++;
            }
        }
        return cnt;
	}
    public int kthSmallest(int[][] matrix, int k) {
        
         int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n-1][n-1];
        int ans=0;
        while(low <= high){
            
            int mid = low + (high - low)/2;
            int cnt = 0;

                cnt = count(matrix,mid);

            
            if(cnt < k){
                low = mid + 1;
            }else{
                ans=mid;
                high = mid-1;
                
            }
            
        }
        
        return ans;
        
//         //1st Method Brute Force TC:O(n*n+nlogn)=(n^2)
//          int n = matrix.length;
//         int [] arr = new int[n*n];
//         int idx = 0;
//         for(int i = 0;i<n;i++){
//             for(int j = 0;j<n;j++){
//                 arr[idx++] = matrix[i][j];
//             }
//         }
//         Arrays.sort(arr);
//         return arr[k - 1];
        
        
        
//         // 2nd Method TC:O(n*n+logk)=O(n^2)
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
//         return hp.peek();
        
        
        
        
        
        
    }
}