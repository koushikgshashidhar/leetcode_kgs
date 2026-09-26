class Solution {
    public int maxArea(int[] height) {

        int start=0,end= height.length-1;
int area=0;
        while(start<end)
        {
            int len= end-start;
            int wid= Math.min(height[start],height[end]);
            area = Math.max(area,len*wid);

            if(height[start]<height[end])
            {
                start++;
            }
            else
            {
                end--;
            }




        }

        return area;

        
    }
}