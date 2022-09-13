class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        
        
        Arrays.sort(tokens);
        int ans=0;
        int score=0;
        int left=0,right=tokens.length-1;
        
        while(left<=right)
        {
            if(power>=tokens[left] )
            {
                power-=tokens[left];
                score++;
                left++;
            }
            else if(score>0)
            {
                power+=tokens[right];
                score--;
                right--;
                
            }
            else
                break;
           ans=Math.max(ans,score);
                
        }
        
     
            return ans;
    }
}