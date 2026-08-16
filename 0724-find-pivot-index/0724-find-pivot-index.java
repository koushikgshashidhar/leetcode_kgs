class Solution {
    public int pivotIndex(int[] nums) {

        int sum=0;
        for(int a:nums)
        sum+=a;
        int psum=0;
        for(int i=0;i<nums.length;i++)
        {

            sum-=nums[i];


            if(psum==sum)return i;

            psum+=nums[i];
        


        }


        return -1;
        
    }
}