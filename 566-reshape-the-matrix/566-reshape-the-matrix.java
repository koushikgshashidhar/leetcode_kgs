class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if(r*c!=mat.length*mat[0].length)
        {
            return mat;
        }
        
        int [][]res= new int[r][c];
        
        int m=0;
        int n=0;
        
        
        for(int i=0;i<r;i++)
        {
            
            for(int j=0;j<c;j++)
            {
                res[i][j]=mat[m][n];
                if(m==mat.length);
                {m=m%mat.length;
                 n++;}
                if(n==mat[0].length)
                {n=n%mat[0].length;
                 m++;
                }
            }
        }
        return res;
    }
}