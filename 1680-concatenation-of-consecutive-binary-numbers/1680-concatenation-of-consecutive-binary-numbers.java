class Solution {
    public int concatenatedBinary(int n) {
        int mod=1_000_000_007;
        long res=0;
        
        for(int i=0;i<=n;i++){
            String bin=Integer.toBinaryString(i);
            res=res<<bin.length()%mod;
            res=(res+i)%mod;
        }
        return (int)(res);
    }
}