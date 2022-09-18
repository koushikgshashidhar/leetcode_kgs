class Solution {
    int [][]dp;
    public int maximumScore(int[] nums, int[] multipliers) {
        int m= multipliers.length;
        dp= new int[m][m];
       return maxScore(0,0,nums,multipliers);
     
    }
    
    
    int maxScore(int i,int l,int []nums,int []mul)
    {
        
        if(i==mul.length)
            return 0;
        
        if(dp[i][l]!=0)return dp[i][l];
        int x=mul[i]*nums[nums.length-1-(i-l)]+maxScore(i+1,l,nums,mul);
        int y=mul[i]*nums[l]+maxScore(i+1,l+1,nums,mul);
        
        dp[i][l]=Math.max(x,y);
        return dp[i][l];
    }
}