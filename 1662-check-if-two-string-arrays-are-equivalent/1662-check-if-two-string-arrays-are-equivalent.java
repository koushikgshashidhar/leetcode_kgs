class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        StringBuilder sb1= new StringBuilder();
        StringBuilder sb2= new StringBuilder();
        
        for(String w:word1)
        {
            sb1.append(w);
        }
           for(String w:word2)
        {
            sb2.append(w);
        }
        
        System.out.println(sb1);
        System.out.println(sb2);
        return (sb1.toString().strip()).equals(sb2.toString().strip());
    }
}