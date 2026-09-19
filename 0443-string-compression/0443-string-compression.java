class Solution {
    public int compress(char[] chars) {
        
        int count =0;
        int ind=0; 

        for(int i=0;i<chars.length;)
        {


            char ch=chars[i];

            while(i<chars.length && ch==chars[i])
            {
                count++;
                i++;

            }
            chars[ind++]=ch;


            if(count>1)
            {
                for(char x:Integer.toString(count).toCharArray())
                {
                    chars[ind++]=x;
                }

            }
            count=0;



        }


        return ind;




    }
}