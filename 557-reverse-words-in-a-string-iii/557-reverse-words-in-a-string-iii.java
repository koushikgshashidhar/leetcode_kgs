class Solution {
    public String reverseWords(String s) {
        String [] words= s.split(" ");
        for(int i=0;i<words.length;i++)
        {
        StringBuilder input1 = new StringBuilder();

        input1.append(words[i]);

        input1.reverse();
            words[i]=input1.toString();
        }
        
        StringBuilder sb= new StringBuilder();
        for(String x:words)
            sb.append(x+" ");
        return sb.toString().strip();
    }
    
}