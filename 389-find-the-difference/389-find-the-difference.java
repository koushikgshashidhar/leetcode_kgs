class Solution {
    public char findTheDifference(String s, String t) {
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
    }
}