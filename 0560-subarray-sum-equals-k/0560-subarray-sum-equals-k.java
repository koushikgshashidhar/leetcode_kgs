class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        int []prefix= new int [nums.length];
        
        prefix[0]=nums[0];
        int res=0;
        for(int i=1;i<prefix.length;i++)
        {
            prefix[i]=prefix[i-1]+nums[i];
            
        }
       // System.out.println(Arrays.toString(prefix));
         for(int i=0;i<prefix.length;i++)
        {
            
             for(int j=i;j<prefix.length;j++)
             {
                if((prefix[j]-prefix[i])==k )
                res++;
             }
            if(prefix[i]==k)
            res++;
            
        }
        return res;
    }
}