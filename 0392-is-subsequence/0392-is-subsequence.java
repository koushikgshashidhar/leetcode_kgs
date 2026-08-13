class Solution {
    public boolean isSubsequence(String s, String t) {

            int ns=s.length();
            int nt=t.length();

        if(ns>nt)return false;
        if(ns==0)return true;
        int x=0;
        for(int i=0;x<ns && i<nt;i++)
        {

           // System.out.println(s.charAt(x)+"  "+t.charAt(i));
            if(s.charAt(x)== t.charAt(i))
            {
                x++;
            }

            
            if(x==ns)return true;

        }

        return false;
        
    }
}