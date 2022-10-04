class Solution {
    public int minCost(String colors, int[] neededTime) {
        
        
        int sum=0;
        for(int i=1;i<colors.length();i++)
        {
            int max=Integer.MIN_VALUE;
            int temp=neededTime[i-1];
            while(i<colors.length() && colors.charAt(i-1)==colors.charAt(i))
            {
             
                max=Math.max(neededTime[i-1],max);
                  max=Math.max(neededTime[i],max);
                temp+=neededTime[i];
                i++;
            }
            if(max!=Integer.MIN_VALUE)
            sum+=(temp-max);
            
        }
        
        return sum;
        
    }
}