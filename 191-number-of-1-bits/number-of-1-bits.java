class Solution {
    public int hammingWeight(int n) {
       int cnt=0;
       while(n>0)
       {
        int dgt=n%2;
        cnt+=dgt;
        n=n/2;
       }  
       return cnt; 
    }
}