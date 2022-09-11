class Solution {
    public int maxProfit(int[] prices) {
        int prev=prices[0];
        int res=0;
        for(int i=1;i<prices.length;i++)
        {
            int temp=Math.max(0,prices[i]-prices[i-1]);
           // prev=prices[i];
            res+=temp;
            
        }
        return res;
    }
}