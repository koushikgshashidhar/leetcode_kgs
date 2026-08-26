class Solution {
    public boolean uniqueOccurrences(int[] arr) {

        HashMap<Integer,Integer> hm= new HashMap<>();

        for(int a:arr)
        {
            hm.put(a,hm.getOrDefault(a,0)+1);
        }

        HashSet<Integer> hs= new HashSet<>();

       for(Map.Entry<Integer,Integer> e :hm.entrySet())
       {
        if(hs.contains(e.getValue()))
        {
            return false;
        }
        hs.add(e.getValue());
       }
       return true;
        
    }
}