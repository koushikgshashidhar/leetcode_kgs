class Solution {
    public int maxProfit(int[] prices) {
//         int res=0;
//         for(int i=1;i<prices.length;i++)
//         {
//             int temp=Math.max(0,prices[i]-prices[i-1]);
//             res+=temp;
            
//         }
        return getMaximumProfit(prices,prices.length);
    }
    static int getMaximumProfit(int Arr[], int n)
{
    //Write your code here
    
    int ahead[]=new int[2];
    int cur[] =new int[2];
    
    //base condition
    ahead[0] = ahead[1] = 0;
    
    int profit=0;
    
    for(int ind= n-1; ind>=0; ind--){
        for(int buy=0; buy<=1; buy++){
            if(buy==0){// We can buy the stock
                profit = Math.max(0+ahead[0], -Arr[ind] + ahead[1]);
            }
    
            if(buy==1){// We can sell the stock
                profit = Math.max(0+ahead[1], Arr[ind] + ahead[0]);
            }
            cur[buy]  = profit;
        }
        
        ahead = (int[])(cur.clone());
    }
    return cur[0];
}
}