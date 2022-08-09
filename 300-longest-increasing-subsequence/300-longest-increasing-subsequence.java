class Solution {
    public int lengthOfLIS(int[] nums) {
 
         //TC:O(n^logn)  and SC : O(n)
        int[] tails = new int[nums.length];
    int size = 0;
    for (int x : nums) {
        int i = 0, j = size;
        while (i != j) {
            int m = (i + j) / 2;
            if (tails[m] < x)
                i = m + 1;
            else
                j = m;
        }
        tails[i] = x;
        if (i == size) ++size;
    }
    return size;
        //TC:O(n^2)  and SC : O(n)
     /*   int []dp = new int[nums.length];
        
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
        
        return Arrays.stream(dp).max().getAsInt();*/
        
        
        
        
    }
}