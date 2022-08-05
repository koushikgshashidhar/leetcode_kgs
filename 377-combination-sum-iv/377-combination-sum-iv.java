class Solution {
    int [][]dp;
    public int combinationSum4(int[] nums, int target) {
        
         
        dp= new int[nums.length][target+1];
        for(int []a:dp)
        Arrays.fill(a,-1);
        findComb(nums,target,0);
          //for(int []a:dp)
        //System.out.println(Arrays.toString(a));
        return dp[0][target];
        
    }
    
     int findComb(int []nums,int tar,int pos)
    {
         if(tar<0)return 0;
        if(tar==0)return 1;
         
         if(dp[pos][tar]!=-1)
             return dp[pos][tar];
         int x=0;
         for(int i=0;i<nums.length;i++)
         {
             
             x+=findComb(nums,tar-nums[i],i);
             
         }
         
         dp[pos][tar]=x;
         return x;
    }
}