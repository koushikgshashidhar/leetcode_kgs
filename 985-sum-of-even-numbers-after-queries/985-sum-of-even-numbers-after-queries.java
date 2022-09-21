class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        
        
        int sum=0;
        
        for(int num:nums)
        {
            if((num&1)==0)sum+=num;
        }
        
        int []res= new int[queries.length];
         int i=0;
        for(int []a:queries)
        {
        if(((nums[a[1]])&1)==0)
           sum-=nums[a[1]];
              nums[a[1]]+=a[0];
            if(((nums[a[1]])&1)==0)
            {
               
                sum+=nums[a[1]];
               //System.out.println("hi"+a[1]);
             }
            res[i++]=sum;
        }
        
        return res;
        
    }
}