class Solution {
    public boolean isPowerOfThree(int n) {
       
        //return n > 0 && 1162261467 % n == 0;
        
         return Integer.toString(n, 3).matches("^10*$");
    }
}