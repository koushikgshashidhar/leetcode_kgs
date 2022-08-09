class Solution {
    public int numFactoredBinaryTrees(int[] arr) {
        
          int n=arr.length;
        int mod=1000000007;
        Arrays.sort(arr);
        long[] dp=new long[n];
        Arrays.fill(dp,1);
        
        HashMap<Integer, Integer> map=new HashMap<>();
        
        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(arr[i]%arr[j]==0 && map.containsKey(arr[i]/arr[j])){
                    dp[i]=(dp[i]+dp[j]*dp[map.get(arr[i]/arr[j])])%mod;
                }
            }
        }
        
        long ans=0;
        for(long a:dp)
            ans+=a;
        return (int)(ans%mod);
    }
}