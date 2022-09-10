class Solution {
    public int maxProfit(int[] prices) {
           int max=0;
        
        if(prices.length<2)
        {
            return max;
        }
        
     
        int min=Integer.MAX_VALUE;
        int bought=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            
//              if(bought>prices[i])
//              {
//                 bought=prices[i];
//              }
                
//                 if(max<(prices[i]-bought))
//                 {
//                     max=(prices[i]-bought);
//                 }
        
            min=Math.min(prices[i],min);
            
            max=Math.max(prices[i]-min,max);
            
        }
        
        return max;
        
    }
}