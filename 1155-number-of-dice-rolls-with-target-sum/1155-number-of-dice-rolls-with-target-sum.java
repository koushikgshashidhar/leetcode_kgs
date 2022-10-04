class Solution {
    int [][]dp;
    int mod=1000000007;
    public int numRollsToTarget(int n, int k, int target) {
        
        dp=new int[n+1][target+1];
      //  for(int []d:dp)
        //Arrays.fill(d,-1);
       return rollup(n,k,target);
    }
    
     int rollup(int n, int k, int target)
    {
         dp[0][0]=1;
         
         
         for(int x=1;x<=n;x++)
         {
             for(int j=1;j<=target;j++)
             {
                 
                  int sum=0;
            for(int i=1;i<=k;i++)
            {
                if(j-i>=0)
                 sum=(sum+dp[x-1][j-i])%mod;
            }
            
        
        dp[x][j]=sum;
                 
        
                 
             }
         }
         
         return dp[n][target];
         
     }
    
    int roll(int n, int k, int target)
    {
        
    //base
            if(target<0)
                return 0;
            if(n!=0 && target==0)
                return 0;
            if(target!=0 && n==0)
                return 0;
        
        if(target==0 &&  n==0)
            return 1;
        
        if(dp[n][target]!=-1)
            return dp[n][target];
        
            int sum=0;
            for(int i=1;i<=k;i++)
             sum=(sum+roll(n-1,k,target-i))%mod;
        
        dp[n][target]=sum;
        
        return sum;
            
            
            
        
    }
}