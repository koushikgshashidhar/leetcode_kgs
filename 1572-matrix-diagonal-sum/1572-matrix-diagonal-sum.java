class Solution {
    public int diagonalSum(int[][] mat) {
     
        
        int sum=0;
        
        for(int i=0;i<mat.length;i++)
        {
            
            sum+=mat[i][i];
        
        
        
        }
        
        for(int i=0;i<mat.length;i++)
        {
            
            sum+=mat[i][mat.length-1-i];
        
        
        
        }
        if(mat.length%2==1)
        return sum-mat[mat.length/2][mat.length/2];
        else
        return sum;
    }
}