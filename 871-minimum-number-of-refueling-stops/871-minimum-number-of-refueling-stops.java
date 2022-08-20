class Node
{
    int station;
    int fuel;
    Node(int x,int y)
    {
        station=x;
        fuel=y;
    }
  
}
class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        PriorityQueue<Node> pq= new PriorityQueue<Node>(
            new Comparator<Node>()
            {
               public int compare(Node a,Node b)
               {
                 return b.fuel-a.fuel;
               }   
            });
        int cur=0;
        int no=0;
        pq.add(new Node(0,startFuel));
        int x=0;
        while(!pq.isEmpty() && cur<target)
        {
            
          Node  temp=pq.poll();
            cur+=temp.fuel;
            no++;
            for(;x<stations.length;x++)
            {
                if(stations[x][0]>cur)
                {
                   break;  
                }
                else
                { pq.add(new Node(stations[x][0],stations[x][1]));
                }
            }

        }
        
        
        if(cur>=target)return no-1;
        else return -1;
        
    }
}