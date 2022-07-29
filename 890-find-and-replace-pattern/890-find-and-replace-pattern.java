class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        
        List<String> res= new ArrayList<String>();
        for(String word:words)
        {
            if(matches(word,pattern))
                res.add(word);
        }
        return res;
    }
    
    boolean matches(String word,String pattern)
    {
        
        char []map= new char[26];
       
        
        for(int i=0;i<word.length();i++)
        {
            char c1=word.charAt(i);
            char c2=pattern.charAt(i);
            
            if(map[c1-'a']==0)
                map[c1-'a']=c2;
            if(map[c1-'a']!=c2)return false;

        }
        boolean [] dup= new boolean[26];
        
        for(char c:map)
        {
            if(c!=0)
            {if(dup[c-'a'])return false;
                dup[c-'a']=true;
            }
        }
        
        return true;
        
    }
}