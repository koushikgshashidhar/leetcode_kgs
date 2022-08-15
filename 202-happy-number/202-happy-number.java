class Solution {
    
    HashSet<Integer> hs= new HashSet<Integer>();
    public boolean isHappy(int n) {
        
       
        
        if(calculate(n))
            return true;
        else
            return false;
        
    }
    
    
    public boolean calculate(int n)
    {
        
        if(n==1) return true;
    
        int x=0;
        
        while(n!=0)
        {
            x+=Math.pow(n%10,2);
            n=n/10;
        }
        
        if(hs.contains(x))
            return false;
        else
            hs.add(x);
        
       return calculate(x);
    }
}