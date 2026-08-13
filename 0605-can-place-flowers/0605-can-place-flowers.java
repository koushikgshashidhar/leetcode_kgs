class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        for(int i=0;i<flowerbed.length;i++)
        {
            if( flowerbed[i]==0)
        {
            int x=0,y=0,sum=0;
            x=i-1;
            y=i+1;

            if(x>=0)
            {
                sum+=flowerbed[x];
            }
              if(y<flowerbed.length)
            {
                sum+=flowerbed[y];
            }
            if(sum==0 ){flowerbed[i]=1;n--;}
        }

        }

        return n<=0;

    


        
    }
}