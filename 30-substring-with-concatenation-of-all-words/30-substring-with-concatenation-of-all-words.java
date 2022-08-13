class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        
        ArrayList<Integer> res= new ArrayList<Integer>();
        if(words==null || s==null || words.length==0 || s.length()==0)
            return res;
        
        
        HashMap<String,Integer> wordsMap= new HashMap<>();
        
        for(String word:words)
        {
            wordsMap.put(word,wordsMap.getOrDefault(word,0)+1);
        }
        
        System.out.println(wordsMap);
        int wordLen=words[0].length();
        for(int i=0;i<=s.length()-(wordLen*words.length);i++)
        {
            
            HashMap<String,Integer> map= new HashMap<>();
            
            for(int j=0;j<words.length;j++)
            {
                int index=i+j*wordLen;
                
                String sub= s.substring(index,index+wordLen);
                if(!wordsMap.containsKey(sub))
                   break;
                  map.put(sub,map.getOrDefault(sub,0)+1);
                if(map.get(sub)>wordsMap.getOrDefault(sub,0))
                    break;
              
                if(j+1==words.length)
                {
                    res.add(i);
                }
                
            }
        }
        
        return res;
    }
}