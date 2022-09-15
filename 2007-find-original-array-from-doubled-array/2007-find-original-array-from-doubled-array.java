class Solution {
    public int[] findOriginalArray(int[] changed) {
        Arrays.sort(changed);
        
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        for(int a:changed)
            hm.put(a,hm.getOrDefault(a,0)+1);
        
        int len= changed.length;
        if(len%2==1) return new int[0]; 
        int[] res= new int[len/2];
        int x=0;
        for(int i=0;i<len;i++ )
        {
           if(hm.containsKey(changed[i]) && hm.get(changed[i])>0)
           {
               if(!hm.containsKey(changed[i]*2) || hm.get(changed[i]*2)<=0)
                   return new int[0]; 
               
               res[x++]=changed[i];
                hm.put(changed[i],hm.getOrDefault(changed[i],0)-1);
                hm.put(changed[i]*2,hm.getOrDefault(changed[i]*2,0)-1);
 
           }
        }
        return res;
    }
}