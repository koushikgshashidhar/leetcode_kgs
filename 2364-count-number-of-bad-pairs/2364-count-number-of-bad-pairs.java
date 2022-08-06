class Solution {
    public long countBadPairs(int[] nums) {
        long good_pairs=0l;
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(i-nums[i],hm.getOrDefault(i-nums[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> ele:hm.entrySet())
        {
            good_pairs+=(1l*ele.getValue()*(ele.getValue()-1))/2;
        }
        long total_pairs=1l*nums.length*(nums.length-1)/2;
        return total_pairs-good_pairs;
    }
}