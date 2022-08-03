class NumArray {
 int []segTree;
      int n;
    public NumArray(int[] nums) {
          n = nums.length;
       segTree= new int[n*4];
        build(nums, 0, n-1, 0);
    }
    
     int build(int []nums, int left, int right, int pos) {
         
         int mid;
         int lsum,rsum;
         if(left==right)return segTree[pos]=nums[left];
         
         mid=left+(right-left)/2;
         lsum=build(nums,left,mid,2*pos+1);
         rsum=build(nums,mid+1,right,2*pos+2);
         return segTree[pos]=lsum+rsum;

    }

   // TC:O(Logn)
    public void update(int index, int val) {
         update(index, val, 0, n-1, 0);
    }
  
    int update(int index, int newValue, int left, int right, int pos) {
        
        int mid,lsum,rsum;
        
        if(index<left || index>right)return segTree[pos];
        if(left==right)return segTree[pos]=newValue;
        mid=left+(right-left)/2;
        
        lsum=update(index,newValue,left,mid,2*pos+1);
        rsum=update(index,newValue,mid+1,right,2*pos+2);
        return segTree[pos]=lsum+rsum;
        
        

    }

    
    // TC:O(Logn)
    public int sumRange(int left, int right) {
         return sumRange(left, right, 0, n-1, 0);
    }
      int sumRange(int gLeft, int gRight, int left, int right ,int pos) {
        int mid,lsum,rsum;
        
        if(gRight<left || gLeft>right)return 0;
        if(gLeft<=left && right<=gRight)return segTree[pos];
        mid=left+(right-left)/2;
        
        lsum=sumRange(gLeft,gRight,left,mid,2*pos+1);
        rsum=sumRange(gLeft,gRight,mid+1,right,2*pos+2);
        return lsum+rsum;
    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */