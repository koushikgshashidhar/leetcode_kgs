class Solution {
    int []dp;
    public int combinationSum4(int[] nums, int target) {
        
         
        dp= new int[target+1];
     
        Arrays.fill(dp,-1);
        findComb(nums,target);
          //for(int []a:dp)
        //System.out.println(Arrays.toString(a));
        return dp[target];
        
    }
    
     int findComb(int []nums,int tar)
    {
         if(tar<0)return 0;
        if(tar==0)return 1;
         
         if(dp[tar]!=-1)
             return dp[tar];
         int x=0;
         for(int i=0;i<nums.length;i++)
         {
             
             x+=findComb(nums,tar-nums[i]);
             
         }
         
         dp[tar]=x;
         return x;
    }
}