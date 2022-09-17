class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        List<List<Integer>> ret = new LinkedList<List<Integer>>();
        
        for(int i = 0;i<words.length;i++)
        {
            map.put(words[i],i); // map words and its index in array.
        }
        
        for(int i = 0;i<words.length;i++) 
        {
            String rvrs = new StringBuilder(words[i]).reverse().toString(); 
            int len = words[i].length();
            // reverse the word and check if the reversed word has any substring in the map.
            int l = 0;
            int r = 0;             
            while(l<=r)
            {
                String sub = rvrs.substring(l,r);
                Integer j = map.get(sub);
                if(j!=null && j!=i)
                {       
                    if(l==0 && isPali(rvrs.substring(r,len))) 
                    {
                        Integer [] tmp = new Integer[]{j,i};
                        ret.add(Arrays.asList(tmp));
                    }
                    else if(r == len&&isPali(rvrs.substring(0,l)))
                    {
                        Integer [] tmp = new Integer[]{i,j};
                        ret.add(Arrays.asList(tmp)); 
                    }
                }
                if(r<len) r++;
                else l++;
            }
        }
        return ret;
    }
     public static boolean isPali(String s)
    {
        char[] SA = s.toCharArray();
        for(int k = 0;k<SA.length/2;k++)
        {
            if(SA[k]!=SA[SA.length-1-k]) return false;
                
        }
        return true;
    }
}