class Point
{
    int x,y;
    
    Point(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int numIslands(char[][] grid) {
        
        int islands=0;
        int []dx={0,0,1,-1};
        int []dy={-1,1,0,0};
        for(int i=0;i<grid.length;i++)
        {
   
            for(int j=0;j<grid[0].length;j++)
            {

                if(grid[i][j]=='1')
                {
                    Queue<Point> q= new ArrayDeque<Point>();
                    q.add(new Point(i,j));
                    grid[i][j]='0';
                    islands++;
                
                    
                    while(!q.isEmpty())
                    {

                        Point temp=q.poll();

                        for(int k=0;k<dx.length;k++)
                        {
                            int tempx=temp.x+dx[k];
                            int tempy=temp.y+dy[k];


                            if(tempx>=0 && tempx<grid.length && tempy>=0 && tempy <grid[0].length)
                            {
                                if(grid[tempx][tempy]=='1')
                                {
                                    q.add(new Point(tempx,tempy));
                                    grid[tempx][tempy]='0';
                                }
                            }

                        }

                    }
                
                }
            }
            
        }
        return islands;
        
    }
}