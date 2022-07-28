class Solution {
    public boolean isAnagram(String s, String t) {
        
      HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

        for(int i=0;i<s.length();i++)
        {
                char c=s.charAt(i);

                if(hm.containsKey(c))
                {
                    hm.put(c,hm.get(c)+1);
                }
                else
                {
                    hm.put(c,1);
                }

        }
        
        HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();

        for(int i=0;i<t.length();i++)
        {
                char c=t.charAt(i);

                if(hm2.containsKey(c))
                {
                    hm2.put(c,hm2.get(c)+1);
                }
                else
                {
                    hm2.put(c,1);
                }

        }
        
        return hm.equals(hm2);
        
    }
}