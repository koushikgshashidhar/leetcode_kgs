class Solution {
    public double average(int[] salary) {
        
        int sum=0;
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int s:salary)
        {
            max=Math.max(max,s);
            min=Math.min(min,s);
            sum+=s;
        }
        return (1d*(sum-max-min)/(salary.length-2));
    }
}