class Solution {
    public String mergeAlternately(String word1, String word2) {

        int w1= word1.length();
        int w2= word2.length();
        int x=0;
        StringBuilder sb= new StringBuilder("");
        for(int i=0;i<Math.max(w1,w2);i++)
        {
            if(i<w1)
            sb.append(word1.charAt(i));

            if(i<w2)
            sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
}