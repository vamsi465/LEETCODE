class Solution {
    double help(double x,long n)
    {
      return  myPow(x,(int)n);

    }
    public double myPow(double x, int n) {
        long N=n;
        if(N<0)
        {
            x=1/x;
            N=-N;
        }
        if(N==0)
        {
            return 1;
        }
        double P=help(x,N/2);
        P=P*P;
        if(N%2==0)
        {
            return P; 
        }
        else{
                return x*P;
        }
        
    }
}