class Solution {
    public int[][] diagonalSort(int[][] A) {
      
            int m = A.length, n = A[0].length;
        HashMap<Integer, PriorityQueue<Integer>> d = new HashMap<>();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                d.putIfAbsent(i - j, new PriorityQueue<>());
                d.get(i - j).add(A[i][j]);
            }
        }
        for (int i = 0; i < m; ++i)
            for (int j = 0; j < n; ++j)
                A[i][j] = d.get(i - j).poll();
        return A;
        
     /*   int j=0;
        for(int i=mat[0].length-1;i>=0;i--)
        {
            
          ArrayList<Integer> al= new ArrayList<Integer>();
            
            int x=j;
            int y=i;
            while(y<mat[0].length && x<mat.length)
            {
                al.add(mat[x][y]);
                Collections.sort(al);
                x++;
                y++;
            }
            x=j;
            y=i;
            while(y<mat[0].length && x<mat.length)
            {
                mat[x][y]=al.get(0);
                if(al.size()!=0)
                al.remove(0);
                x++;
                y++;
            }
            
        }
        
        
        for(int i=1;i<mat.length;i++)
        {
            
          ArrayList<Integer> al= new ArrayList<Integer>();
            
            int x=i;
            int y=j;
            while(y<mat[0].length && x<mat.length)
            {
                al.add(mat[x][y]);
                Collections.sort(al);
                x++;
                y++;
            }
            x=i;
            y=j;
            while(y<mat[0].length && x<mat.length)
            {
                mat[x][y]=al.get(0);
                if(al.size()!=0)
                al.remove(0);
                x++;
                y++;
            }
            
        }
        
        
        return mat;*/
        
    }
}