class Solution {
    public int subarraySum(int[] nums, int k) {
        
        
        int []prefix= new int [nums.length];
        HashMap<Integer,Integer> hm = new HashMap<>();
        int sum=0;
        
       // prefix[0]=nums[0];
      //  hm.put(prefix[0],1);
        int res=0;
        // for(int i=1;i<prefix.length;i++)
        // {
        //     prefix[i]=prefix[i-1]+nums[i];
            
        //   //  hm.put(prefix[i],hm.getOrDefault(prefix[i],0)+1);
            
        // }
        
        
       // System.out.println(Arrays.toString(prefix));
       
         for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            if(hm.containsKey(sum-k))
            {
                res+=hm.get(sum-k);
               // hm.put(prefix[i]-k,hm.get(prefix[i]-k));
                
            }
               
            if(sum==k)
                res++;
                
                  hm.put(sum,hm.getOrDefault(sum,0)+1);
            
        }
        
        
      
        
        return res;
    }
}