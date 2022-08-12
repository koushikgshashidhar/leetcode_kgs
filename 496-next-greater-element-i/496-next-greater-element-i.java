class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        HashMap<Integer,Integer> hm= new HashMap<>();
        
        Stack<Integer> st = new Stack<Integer>();
        int i=0;
        for(int num:nums2)
        { 
            hm.put(num,i);
            i++;
            
        }
        
        for(int j=0;j<nums1.length;j++)
        {
            boolean flag=true;
            for(int pos=hm.get(nums1[j])+1;pos<nums2.length;pos++)
            {
                if(nums2[pos]>nums1[j])
                {
                    nums1[j]=nums2[pos];
                    flag=false;
                    break;
                    
                }
            }
            
            if(flag)
                nums1[j]=-1;
            
        }
        
        return nums1;
    }
}