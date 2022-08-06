class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        
      HashMap<Integer,Long> hm = new HashMap<Integer,Long>();
        long res=0l;
        
        for(int task: tasks)
        {
            if(hm.containsKey(task))
            {
                hm.put(task,res=Math.max(res,hm.get(task)+space)+1);
            }
            else
            {
             hm.put(task,++res);       
            }
        }
        return res;
    }
}