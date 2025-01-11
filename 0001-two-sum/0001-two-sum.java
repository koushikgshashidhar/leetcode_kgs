class Solution {
    public int[] twoSum(int[] nums, int target) {
        

        HashMap<Integer,Integer> hm = new  HashMap<Integer,Integer>();
        int x=0;
        for(int a:nums)
        {
            if(hm.containsKey(target-a))
            {
                return new int[]{hm.get(target-a),x};
            }
            hm.put(a,x);
            x++;
        } 
        return new int[]{};
    }
}