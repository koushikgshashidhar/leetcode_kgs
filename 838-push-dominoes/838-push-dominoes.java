class Solution {
    public String pushDominoes(String dominoes) {
        
        char []arr= dominoes.toCharArray();
        int []left= new int[arr.length];
          int []right= new int[arr.length];
        Arrays.fill(left,Integer.MAX_VALUE);
          Arrays.fill(right,Integer.MAX_VALUE);
        int x=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='R')
            {
                x=0;
            }
            else if(arr[i]=='L')
            {
                x=-1;
            }
            else if(x>=0)
            {
                right[i]= ++x;
            }
        }
        x=-1;
        for(int i=arr.length-1;i>=0;i--)
        {
             if(arr[i]=='L')
            {
                x=0;
            }
            else if(arr[i]=='R')
            {
                x=-1;
            }
            else if(x>=0)
            {
                left[i]= ++x;
            }
        }
        // System.out.println(Arrays.toString(left));
        //    System.out.println(Arrays.toString(right));
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]=='.')
            {
                if(left[i]<right[i])
                    sb.append('L');
                else  if(left[i]>right[i])
                    sb.append('R');
                else sb.append('.');
            }
            else
            {
                sb.append(arr[i]);
            }
        }
        return sb.toString();
    }
}