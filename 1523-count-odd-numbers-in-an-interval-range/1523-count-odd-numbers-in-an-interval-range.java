class Solution {
    public int countOdds(int low, int high) {
        int cnt=0;
    
       int ans=high-low+1;
        if(low%2==0)
        {
            cnt=ans/2;
        }
        else
        {
            cnt=(ans+1)/2;
        }
        return cnt;
    }
}