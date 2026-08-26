class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l= nums.length;

        int[] suff= new int[l];
        suff[l-1]=nums[l-1];
        suff[l-1]=nums[l-1];
        int x=1;
        for(int i=l-1;i>=0;i--)
        {
            suff[i]=x*nums[i];
            x=x*nums[i];
        }
        int prefix=1;
        for(int i=0;i<l;i++)
        {
           if(i==l-1)
            suff[i]= prefix;
           else
               suff[i]= prefix*suff[i+1];
               prefix*=nums[i];
        
        }
        return suff;




        
    }
}