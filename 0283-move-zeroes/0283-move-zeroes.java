class Solution {
    public void moveZeroes(int[] nums) {
        
        int i=0,j=0;

        for(int k=0;k<nums.length;k++)
        {
            if(nums[k]!=0)
            {
                int temp= nums[i];
                nums[i]=nums[k];
                nums[k]=temp;
                i++;
            }
        
        }


    }
}