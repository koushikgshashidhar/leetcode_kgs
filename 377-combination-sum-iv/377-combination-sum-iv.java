//Bottom up approach

class Solution {
 
    public int combinationSum4(int[] nums, int target) {

          int []dp= new int[target+1];
        
        dp[0]=1;
        
        for(int i=1;i<=target;i++)
        {
            
            for(int j=0;j<nums.length;j++)
            {
                if(i-nums[j]>=0)
                    dp[i]+=dp[i-nums[j]];
            }
        }
     
        return dp[target];
    }
}
//Top Down approach
// class Solution {
//     int []dp;
//     public int combinationSum4(int[] nums, int target) {

//         dp= new int[target+1];
     
//         Arrays.fill(dp,-1);
//         findComb(nums,target);
//           //for(int []a:dp)
//         //System.out.println(Arrays.toString(a));
//         return dp[target];
        
//     }
    
//      int findComb(int []nums,int tar)
//     {
//          if(tar<0)return 0;
//         if(tar==0)return 1;
         
//          if(dp[tar]!=-1)
//              return dp[tar];
//          int x=0;
//          for(int i=0;i<nums.length;i++)
//          {
//              x+=findComb(nums,tar-nums[i]);
             
//          }
         
//          dp[tar]=x;
//          return x;
//     }
// }