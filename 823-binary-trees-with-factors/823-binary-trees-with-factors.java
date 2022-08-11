class Solution {
     // TC : O(n2)
    //  SC: O(n)
    public int numFactoredBinaryTrees(int[] arr) {
    
        Arrays.sort(arr);
        
        HashMap<Integer,Long> hm= new HashMap<>();
        
        for(int i=0;i<arr.length;i++)
        {
            long cnt=1;
            for(int j=0;j<i;j++)
            {
                
                if(arr[i]%arr[j]==0)
                {
                    if(hm.containsKey(arr[i]/arr[j]))
                    {
                        cnt+=hm.get(arr[j])*hm.get(arr[i]/arr[j]);
                    }
                }
            }
            
            hm.put(arr[i],cnt);
        }
        
        long res=0;
        
        for(Map.Entry<Integer,Long> ele : hm.entrySet())
        {
            res=(res+ele.getValue())%(1000000000+7);
        }
        
        return (int)(res);
    }
}