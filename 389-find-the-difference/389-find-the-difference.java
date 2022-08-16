class Solution {
    public char findTheDifference(String s, String t) {
     
       char c = 0;
        for(char cs : s.toCharArray()) c ^= cs;
        for(char ct : t.toCharArray()) c ^= ct;
        return c;  
        
        /*
        int res=1;
        int []arr= new int[26];
        for(int i=0;i<s.length();i++)
        {
         arr[s.charAt(i)-'a']++;  
        }
        
         for(int i=0;i<t.length();i++)
        {
         arr[t.charAt(i)-'a']--;  
        }
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
                return (char)('a'+i);
        }
         return 'x';
        */
    }
}