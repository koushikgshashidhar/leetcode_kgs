class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n=bloomDay.length;
        if(n<((long)m*k))return -1;

        int left=1, right=(int)1e9;
        while(left<right)
        {
            int mid=left+(right-left)/2;

            int cnt=0,boq=0;

            for(int i=0;i<n;i++)
            {
                if(bloomDay[i]>mid)
                {
                    cnt=0;
                }
                else if(++cnt>=k)
                {
                    boq++;
                    cnt=0;
                }
            }

            if(boq>=m)
            {
                right=mid;
            }
            else
            {
                left=mid+1;
            }

        }
        return left;
    }
}