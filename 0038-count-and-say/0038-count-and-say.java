class Solution {
    public String countAndSay(int n) {
        
        String s="1";
        for(int i=1;i<n;i++)
        {
            s=countAndSay(s);
        }
        return s;
    }
    
    String countAndSay(String s)
    {
        StringBuilder sb= new StringBuilder();
        
        
        char prev=s.charAt(0);
        int cnt=1;
        for(int i=1;i<s.length();i++)
        {
            
            if(s.charAt(i)==prev)
            {
                cnt++;
            }
            else
            {
                sb.append(cnt);
                sb.append(prev);
                
                prev=s.charAt(i);
                cnt=1;
                
            }
        }
        
        sb.append(cnt);
        sb.append(prev);
        
        return sb.toString();
    }
}