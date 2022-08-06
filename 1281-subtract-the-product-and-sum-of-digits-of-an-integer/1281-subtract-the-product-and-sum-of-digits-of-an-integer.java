class Solution {
    public int subtractProductAndSum(int n) {
        int temp=n;
        int pro=1;int sum=0;
        while(temp!=0)
        {
            int rem=temp%10;
            pro*=rem;
            sum+=rem;
            temp=temp/10;
        }
        return pro-sum;
    }
}