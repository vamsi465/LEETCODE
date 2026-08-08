class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n=arr.length;
        int cnt=0;
        for(int i=0;i<=n-3;i++)
        {
            for(int j=i+1;j<=n-2;j++)
            {
                for(int k=j+1;k<=n-1;k++)
                 {
                    int x=arr[i]-arr[j];
                    int y=arr[j]-arr[k];
                    int z=arr[i]-arr[k];
                    if(Math.abs(x)<=a && Math.abs(y)<=b && Math.abs(z)<=c)
                    {
                        cnt++;
                    }
                 }
            }
        }
        return cnt;
    }
}