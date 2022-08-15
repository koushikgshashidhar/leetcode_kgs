class Solution {
    public boolean isAnagram(String s, String t) {
      
        
        //Better optimized way with constant array space
        if(s.length()!=t.length())return false;
        int []arr= new int[26];
        
        for(char c:s.toCharArray())
        {
            arr[c-'a']++;
        }
        for(char c:t.toCharArray())
        {
            arr[c-'a']--;
            if(arr[c-'a']<0)return false;
        }
        
        return true;
 
        
//Brute Force way with extra space of hashMap     
        
//       HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

//         for(int i=0;i<s.length();i++)
//         {
//                 char c=s.charAt(i);

//                 if(hm.containsKey(c))
//                 {
//                     hm.put(c,hm.get(c)+1);
//                 }
//                 else
//                 {
//                     hm.put(c,1);
//                 }

//         }
        
//         HashMap<Character,Integer> hm2 = new HashMap<Character,Integer>();

//         for(int i=0;i<t.length();i++)
//         {
//                 char c=t.charAt(i);

//                 if(hm2.containsKey(c))
//                 {
//                     hm2.put(c,hm2.get(c)+1);
//                 }
//                 else
//                 {
//                     hm2.put(c,1);
//                 }

//         }
        
//         return hm.equals(hm2);
        
    }
}