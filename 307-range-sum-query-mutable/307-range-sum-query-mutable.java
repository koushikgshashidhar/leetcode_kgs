class NumArray {
 int []segTree;
      int n;
    public NumArray(int[] nums) {
          n = nums.length;
       segTree= new int[n*4];
        build(nums, 0, n-1, 0);
    }
    
     int build(int []nums, int left, int right, int node) {
        int middle;
        int leftSum, rightSum;

        if (left == right) return segTree[node] = nums[left];

        middle = (left + right) / 2;
        leftSum = build(nums, left, middle, 2 * node + 1);
        rightSum = build(nums, middle+1, right, 2 * node + 2);
        return segTree[node] = leftSum + rightSum;
    }

    public void update(int index, int val) {
         update(index, val, 0, n-1, 0);
    }
  
    int update(int index, int newValue, int ss, int se, int node) {
        int leftSum, rightSum;
        int middle;

        if (index < ss || index > se) return segTree[node];
        if (ss == se) return segTree[node] = newValue;

        middle = (ss + se) / 2;
        leftSum = update(index, newValue, ss, middle, 2 * node + 1);
        rightSum = update(index, newValue, middle+1, se, 2 * node + 2);
         segTree[node] = leftSum + rightSum;
        return segTree[node];
    }

    
    public int sumRange(int left, int right) {
         return sumRange(left, right, 0, n-1, 0);
    }
      int sumRange(int left, int right, int ss, int se, int node) {
        int leftSum, rightSum;
        int middle;

        if (right < ss || left > se) return 0;
        if (left <= ss && se <= right) return segTree[node];

        middle = (ss + se) / 2;
        leftSum = sumRange(left, right, ss, middle, 2 * node + 1);
        rightSum = sumRange(left, right, middle+1, se, 2 * node + 2);

        return leftSum + rightSum;
    }

}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */