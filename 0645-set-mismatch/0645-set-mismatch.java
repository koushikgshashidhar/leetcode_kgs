class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int [] arr= new int[2];
        int xor=0;
        int y=1;
        for(int a:nums)
        {
            xor=xor^a^y;
            y++;
        }
        int pos=0;
        while((xor&(1<<pos))==0)
        {
            pos++;
        }
        int res1=0,res2=0;
        y=1;
        for(int a:nums)
        {
            if((a&(1<<pos))!=0)
                res1^=a;
            else
                res2^=a;
            
            if((y&(1<<pos))!=0)
                res1^=y;
            else
                res2^=y;
            
            y++;
            
        }
        
        for(int a:nums)
        {
            if(a==res1)
                 return new int[]{res1,res2};
        }
       
        
        return new int[]{res2,res1};
        
        
    }
}