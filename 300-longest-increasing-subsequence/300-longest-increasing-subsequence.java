class Solution {
    public int lengthOfLIS(int[] nums) {
        int []dp = new int[nums.length];
        
        dp[0]=1;
        
        for(int i=1;i<nums.length;i++)
        {
            int temp=0;
            
            for(int j=0;j<i;j++)
            {
                if(nums[j]<nums[i])
                {
                    temp=Math.max(temp,dp[j]);
                }
            }
            dp[i]=temp+1;
            
        }
        
        return Arrays.stream(dp).max().getAsInt();
    }
}