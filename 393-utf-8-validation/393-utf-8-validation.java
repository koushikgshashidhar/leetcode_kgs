class Solution {
    public boolean validUtf8(int[] data) {
        
        
        int checkNum=0;
        
        
        for(int a:data)
        {
            if(checkNum==0)
            {
                
                if((a>>5)==0b110)
                {
                    checkNum=1;
                }
                else if((a>>4)==0b1110)
                {
                    checkNum=2;
                }
                else  if((a>>3)==0b11110)
                {
                    checkNum=3;
                }
                else  if((a>>7)!=0b0)
                {
                    return false;
                }
                
                
            }
            else
            {
                if((a>>6)!=0b10)
                return false;
                 checkNum--;
                
                
            }
   
            
        }        
        return(checkNum==0);
            
    }
}