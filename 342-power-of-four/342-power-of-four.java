class Solution {
    public boolean isPowerOfFour(int n) {
//         if(n==0)return false;
//         if(n==1)return true;
//         while(n%4==0)
//         {
//             n=n/4;
//         }
        
//         if(n==1)return true;
        
//         return false;
        
        if(n<=0) return false;
       if((n&(n-1))!=0) return false;
        return (n-1)%3==0;
    }
}