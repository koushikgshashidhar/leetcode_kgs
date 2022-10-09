class Solution {
    public int mySqrt(int x) {
        
        if(x==0)return 0;
        long l=1;
        long h=x;
        long mid=0;
        while(l<h)
        {
           mid=l+(h-l)/2;
            
            if(mid*mid<=x && (mid+1)*(mid+1)>x)
                return (int)mid;
            if(mid*mid>x)
            {
                h=mid;
            }
            else
            {
                l=mid+1;
            }
            
        }
        return (int)l;
    }
}