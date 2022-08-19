class Solution {
    public boolean isPossible(int[] nums) {
        
        HashMap<Integer,Integer> freq_hm= new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> ext_hm= new HashMap<Integer,Integer>();
        
        for(int i:nums)
        {
            freq_hm.put(i,freq_hm.getOrDefault(i,0)+1);
        }
        
        for(int i:nums)
        {
            if(freq_hm.get(i)==0)continue;
            if(ext_hm.getOrDefault(i,0)>0)
            {
                ext_hm.put(i,ext_hm.get(i)-1);
                ext_hm.put(i+1,ext_hm.getOrDefault(i+1,0)+1);
                freq_hm.put(i,freq_hm.get(i)-1);
            }
            else if(freq_hm.getOrDefault(i,0)>0 && freq_hm.getOrDefault(i+1,0)>0 && freq_hm.getOrDefault(i+2,0)>0)
            {
                freq_hm.put(i,freq_hm.get(i)-1);
                freq_hm.put(i+1,freq_hm.get(i+1)-1);
                freq_hm.put(i+2,freq_hm.get(i+2)-1);
                ext_hm.put(i+3,ext_hm.getOrDefault(i+3,0)+1);   
            }
            else
            return false;

        }
        
        return true;
        
    }
}