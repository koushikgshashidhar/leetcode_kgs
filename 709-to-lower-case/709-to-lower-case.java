class Solution {
    public String toLowerCase(String s) {
        
        int dif='a'-'A';
        char [] arr= s.toCharArray();
        
        StringBuilder res= new StringBuilder();
        
        for(char c:arr)
        {
            int x=c;
            if(x>=65 && x<91)
            {
                x+=dif;
            }
            res.append((char)x);
        }
        
        
        return res.toString();
    }
}