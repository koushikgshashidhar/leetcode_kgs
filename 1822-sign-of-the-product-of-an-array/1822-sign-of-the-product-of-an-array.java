class Solution {
    public int arraySign(int[] nums) {
      int neg=0;
        int pos=0;
        for(int a:nums)
        {
            if(a==0)return 0;
            if(a<0)
                neg++;
        }
        
        if(neg%2==1)
            return -1;
        else
            return 1;
        
    }
}