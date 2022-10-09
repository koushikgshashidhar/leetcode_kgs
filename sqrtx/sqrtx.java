class Solution {
    public int mySqrt(int x) {
        
        if(x==0)return 0;
        int l=1;
        int h=x;
        int mid=0;
        while(l<h)
        {
           mid=l+(h-l)/2;
            
            if(mid<=x/mid && (mid+1)>x/(mid+1))
                return mid;
            if(mid>x/mid)
            {
                h=mid;
            }
            else
            {
                l=mid+1;
            }
            
        }
        return l;
    }
}