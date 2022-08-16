class Solution {
    public int firstUniqChar(String s) {
        int []freq=new int[26];
        
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
    }
}