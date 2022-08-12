class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        int i=0,j=0;
        StringBuilder sbr= new StringBuilder();
        while(i<word1.length() && j<word2.length())
        {
            sbr.append(word1.charAt(i));
            sbr.append(word2.charAt(j));
            i++;
            j++;
        }
         while(i<word1.length())
        {
            sbr.append(word1.charAt(i));
             i++;
          
        }
         while( j<word2.length())
        {
            sbr.append(word2.charAt(j));
             j++;
        }
        
        return sbr.toString();
    }
}