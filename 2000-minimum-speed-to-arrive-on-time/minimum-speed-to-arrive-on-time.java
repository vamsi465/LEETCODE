class Solution {
    boolean isPossible(int mid,int[] dist,double hour)
    {
        double h=0;
        for(int i=0;i<dist.length-1;i++)
        {
          h+=(dist[i]+mid-1)/mid; 
        }
        h+=(double)dist[dist.length-1]/mid;
        if(h>hour)
        {
            return false;
        }
       return true; 
    }
    public int minSpeedOnTime(int[] dist, double hour) {
      int st=1;
      int end=10000000;
      int ans=-1;
      if (hour <= dist.length - 1)
        {
          return -1;
        }
       while(st<=end)
       {
        int mid=st+(end-st)/2;
        if(isPossible(mid,dist,hour))
        {
            ans=mid;
            end=mid-1;
        }
        else 
        {
            st=mid+1;
        }
       }
       return ans;
    }
}