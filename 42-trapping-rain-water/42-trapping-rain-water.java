class Solution {
    public int trap(int[] height) {
        
        
        int res=0;
        int l=0;
        int r=height.length-1;
        int leftMax=0;
        int rightMax=0;
        
        while(l<r)
        {
            
            if(height[l]<=height[r])
            {
                leftMax=Math.max(leftMax,height[l]);
                if(height[l]<leftMax)
                {
                    res+=leftMax-height[l];
                }
                l++;
            }
            else
            {
                rightMax=Math.max(rightMax,height[r]);
                if(height[r]<rightMax)
                {
                    res+=rightMax-height[r];
                }
                
                r--;
            }
      
        }
        
        return res;
        
    }
}