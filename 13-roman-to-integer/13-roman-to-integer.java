class Solution {
    public int romanToInt(String s) {
        
        int [] arr= new int[26];
        arr['I'-'A']=1;
        arr['V'-'A']=5;
        arr['X'-'A']=10;
        arr['L'-'A']=50;
        arr['C'-'A']=100;
        arr['D'-'A']=500;
        arr['M'-'A']=1000;
        
        int res=0;
        int last=arr[s.charAt(s.length()-1)-'A'];
        for(int i=s.length()-1;i>=0;i--)
        {
            
            int c=s.charAt(i)-'A';
            
            if(arr[c]>=last)
                res+=arr[c];
            else
                res-=arr[c];
            last=arr[c];
            
        }
        return res;
        
//            int res=0;
//         int []arr=new int[26];
        
//         arr['I'-'A']=1;
//         arr['V'-'A']=5;
//         arr['X'-'A']=10;
//         arr['L'-'A']=50;
//         arr['C'-'A']=100;
//         arr['D'-'A']=500;
//         arr['M'-'A']=1000;
        
//         int temp=(int)(s.charAt(s.length()-1)-'A');
//         for(int i=s.length()-1;i>=0;i--)
//         {
            
//            int c=(int)(s.charAt(i)-'A');
            
//            if(arr[temp]<=arr[c])
//                res=res+arr[c];
//             else
//                res=res-arr[c];
            
//             temp=c;
            
//         }
        
        
//         return res;
        
    }
}