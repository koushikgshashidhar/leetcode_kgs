class Solution {
    public String reverseWords(String s) {
        String [] words= s.split(" ");
          StringBuilder sb= new StringBuilder();
        for(int i=0;i<words.length;i++)
        {
        StringBuilder input1 = new StringBuilder();

        input1.append(words[i]);

        input1.reverse();
        
            sb.append(input1+" ");
            
        }
        
        return sb.toString().strip();
    }
    
}