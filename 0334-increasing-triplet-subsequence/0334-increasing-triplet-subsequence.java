class Solution {
    public boolean increasingTriplet(int[] nums) {
        
        int tmp1=Integer.MAX_VALUE,tmp2=Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++)
        {
           
            if(nums[i]<=tmp1)
            {
                tmp1=nums[i];
            }
            else if(nums[i]<=tmp2)
            {
                tmp2=nums[i];
            }
            else
                return true;
        }
        return false;
    }
}