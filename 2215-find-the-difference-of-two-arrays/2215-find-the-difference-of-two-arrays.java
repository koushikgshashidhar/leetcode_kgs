class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        
        HashSet<Integer> hs1= new HashSet<Integer>();
        HashSet<Integer> hs2= new HashSet<Integer>();


        for(int a:nums1)
        {
            hs1.add(a);
        }

         for(int a:nums2)
        {
            hs2.add(a);
        }
 List<List<Integer>> res = new ArrayList<>();
      res.add(new ArrayList<Integer>());
          res.add(new ArrayList<Integer>());


         for(int a:hs1)
        {
            if(!hs2.contains(a))
            res.get(0).add(a);
        }

         for(int a:hs2)
        {
             if(!hs1.contains(a))
             res.get(1).add(a);
        }



return res;

    }
}