class Solution {
    public int firstUniqChar(String s) {
   
        
         int ans = Integer.MAX_VALUE;
        for (char i = 'a'; i <= 'z';i++) {
            int ind = s.indexOf (i);
            if (ind != -1 && ind == s.lastIndexOf (i))
                ans = Math.min (ans,ind);
        }
        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
        
        
        
        /*int []freq=new int[26];
        
        char []arr= s.toCharArray();
        
        for(char c:arr)
        {
            freq[c-'a']++;
        }
        int i=0;
        for(char c:arr)
        {
            if(freq[c-'a']==1)
                return i;
            i++;
        }
        
        return -1;
        
        */
    }
}