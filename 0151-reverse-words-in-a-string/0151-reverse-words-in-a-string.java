class Solution {
    public String reverseWords(String s) {

       String [] st= s.split(" ");

       StringBuilder sb = new StringBuilder();

       for(int i=st.length-1;i>=0;i--)
       {
        if(st[i].length()==0)continue;
        sb.append(st[i].strip());
         sb.append(" ");
       }

       return sb.toString().strip();
        
    }

    public String reverse(String s)
    {
        return new StringBuilder(s).reverse().toString();
    }
}