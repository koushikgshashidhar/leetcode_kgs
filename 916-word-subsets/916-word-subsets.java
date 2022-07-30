class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
     
         int []w2= new int[26];
        //finding the max array
        for(String s:words2)
        {
           int []temp=count(s);
            for(char c:s.toCharArray())
                w2[c-'a']=Math.max(temp[c-'a'],w2[c-'a']);
            
        }
      
        List<String> ls= new ArrayList<String>();
    label:
        for(String s:words1)
        {
             int []temp= count(s);
             for(int i=0;i<26;i++)
            {
                 if(temp[i]<w2[i])
                 continue label;
            }
            ls.add(s);  
        }
        return ls;
    }
    int [] count(String s)
    {
        int [] arr= new int[26];
         for(char c:s.toCharArray())
                arr[c-'a']++;
        
        return arr;
    }
}