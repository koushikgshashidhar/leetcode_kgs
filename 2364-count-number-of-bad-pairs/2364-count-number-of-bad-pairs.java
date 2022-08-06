class Solution {
    public long countBadPairs(int[] nums) {
        long cnt=0l;
        HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(i-nums[i],hm.getOrDefault(i-nums[i],0)+1);
        }
        
        for(Map.Entry<Integer,Integer> ele:hm.entrySet())
        {
            cnt+=(1l*ele.getValue()*(ele.getValue()-1))/2;
        }
        long t=1l*nums.length*(nums.length-1)/2;
        return t-cnt;
    }
}