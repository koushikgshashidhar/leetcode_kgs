class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        
        char []ran = new char[26];
        char []mag = new char[26];
        
        for(int i=0;i<ransomNote.length();i++)
        {
            ran[ransomNote.charAt(i)-'a']++;
        }
        
        for(int i=0;i<magazine.length();i++)
        {
            mag[magazine.charAt(i)-'a']++;
        }
        
        
        for(int i=0;i<26;i++)
        {
            if(ran[i]>mag[i])return false;
        }
        return true;
    }
}