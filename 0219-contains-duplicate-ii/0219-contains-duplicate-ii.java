class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
         Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(i > k) set.remove(nums[i-k-1]);
            if(!set.add(nums[i])) return true;
        }
        return false;
//         HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        
//         for(int i=0;i<nums.length;i++)
//         {
//             if(hm.containsKey(nums[i]))
//             {
//                 if(i-hm.get(nums[i])<=k)
//                 {
//                     return true;
//                 }
//             }           
//                 hm.put(nums[i],i);
//            
//         }
//         return false;
    }
}