class Solution {
    public int hammingWeight(int n) {
       int cnt=0;
       int last_digit=0;
       while(n>0)
       {
        last_digit=n&1;
        cnt+=last_digit;
        n=n>>1;
       }  
       return cnt; 
    }
}