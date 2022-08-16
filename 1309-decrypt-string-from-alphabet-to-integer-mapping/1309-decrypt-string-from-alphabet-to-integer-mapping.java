class Solution {
    public String freqAlphabets(String s) {
        
         StringBuilder output = new StringBuilder(); //used stringbuiled append b/c it's optimized
        
        for(int i = s.length()-1; i >= 0; i--){ //starts from last character, goes till first character
            
            if(s.charAt(i) == '#'){
                output.append((char)('a' + (s.charAt(i-1) -'0' ) -1+ 10*(s.charAt(i-2)-'0') ) ); 
                //using ascii, add 'a' to start from the alphabet, subtract '0' b/c currently the digits in the String s are chars
                
                i -= 2; //have skip 2 characters , b/c we already checked it in the above line
            } else {
                output.append((char)('a' + (s.charAt(i) - '0') -1));
            }
        }
        output.reverse(); //very helpful method, reverses the whole string
        
        return output.toString(); //convert StringBuilder obj to string
        /* HashMap<String, Character> map = new HashMap<>();
        int k = 1;
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (ch < 'j')
                map.put(String.valueOf(k++), ch);
            else
                map.put(String.valueOf(k++)+"#", ch);
        }
        
        StringBuilder sb = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            if (s.charAt(i) == '#') {
                sb.append(map.get(s.substring(i - 2, i+1)));
                i -= 3;
            } else {
                sb.append(map.get(s.substring(i, i + 1)));
                i--;
            }
        }
        
        return sb.reverse().toString*/
    }
}