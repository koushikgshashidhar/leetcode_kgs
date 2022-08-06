class Solution {
    public long taskSchedulerII(int[] tasks, int space) {
        
//       HashMap<Integer,Long> hm = new HashMap<Integer,Long>();
//         long res=0l;
        
//         for(int task: tasks)
//         {
//             if(hm.containsKey(task))
//             {
//                 hm.put(task,res=Math.max(res,hm.get(task)+space)+1);
//             }
//             else
//             {
//              hm.put(task,res+);       
//             }
//         }
//         return res;
        
        Map<Integer, Long> next = new HashMap<>();;
        long res = 0;
        for (int a : tasks) {
            res = Math.max(next.getOrDefault(a, 0L), res + 1);
            next.put(a, res + space + 1);
        }
        return res;
    }
}