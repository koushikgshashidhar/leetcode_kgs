class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int point=-1;
        int res=Integer.MAX_VALUE;
        int index=0;
        for(int []tmp:points)
        {
            if(x==tmp[0] || y==tmp[1])
            {
                if(res>Math.abs(x-tmp[0])+Math.abs(y-tmp[1]))
                {
                    res=Math.abs(x-tmp[0])+Math.abs(y-tmp[1]);
                    point=index;
                }           
            }
            index++;
        }
       
        
        return point;
        
    }
}