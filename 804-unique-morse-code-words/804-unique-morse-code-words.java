class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        
        String [] morse= {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    
    HashSet<String> hs = new HashSet();
    
    for(String s:words)
    {
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            temp+=morse[s.charAt(i)-'a'];
        }
        hs.add(temp);
    }
    return hs.size();
    }
}