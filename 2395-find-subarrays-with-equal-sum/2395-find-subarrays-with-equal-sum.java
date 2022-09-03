class Solution {
    public boolean findSubarrays(int[] nums) {
        
        if(nums==null || nums.length<3)
            return false;
        HashSet<Integer> hs= new HashSet<Integer>();
        int sum=nums[0]+nums[1];
        hs.add(sum);
        for(int i=2;i<nums.length;i++)
        {
            sum=sum-nums[i-2]+nums[i];
            if(hs.contains(sum))
                return true;
            hs.add(sum);
            
        }
        return false;
    }
}