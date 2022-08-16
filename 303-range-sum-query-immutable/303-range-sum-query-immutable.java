class NumArray {

    int []arr;
    int []prefix;
    public NumArray(int[] nums) {
        arr=nums;
        prefix= new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<nums.length;i++)
        {
            prefix[i]=prefix[i-1]+arr[i];
        }
        
        System.out.println(Arrays.toString(prefix));
    }
    
    public int sumRange(int left, int right) {
        
        int sum=0;
        sum+=prefix[right];
        if(left>0)
        sum-=prefix[left-1];
        
        return sum;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */