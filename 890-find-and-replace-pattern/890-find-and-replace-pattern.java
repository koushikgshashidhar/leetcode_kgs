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
        
        char []fir= new char[26];
        char []sec= new char[26];
        
        for(int i=0;i<word.length();i++)
        {
            char c1=word.charAt(i);
            char c2=pattern.charAt(i);
            
            if(fir[c1-'a']==0)
                fir[c1-'a']=c2;
            
            if(sec[c2-'a']==0)
                sec[c2-'a']=c1;
            
            if((fir[c1-'a']!=c2) || (sec[c2-'a']!=c1))
                return false;
        }
        
        return true;
        
    }
}