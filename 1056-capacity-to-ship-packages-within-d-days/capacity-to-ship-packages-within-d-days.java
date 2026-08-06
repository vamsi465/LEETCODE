class Solution {
    int max(int weights[])
    {
        int maxi=weights[0];
        for(int i=1;i<weights.length;i++)
        {
            if(maxi<weights[i]){
                maxi=weights[i];
            }
        }
        return maxi;
    }
    int sumOfDigits(int[] weights)
    {
        int sum=0;
        for(int wt:weights)
        {
            sum+=wt;
        }
        return sum;
    }
    boolean isPossible(int mid,int[] weights,int days)
    {
        int wt=0;
        int cnt=1;
        for(int i=0;i<weights.length;i++)
        {
            if(wt+weights[i]>mid)
            {
                cnt++;
                wt=weights[i];
            }
            else
            {
                wt+=weights[i];
            }
            if(cnt>days)
            {
                return false;
            }
        }
        return true;

    }
    public int shipWithinDays(int[] weights, int days) {
      int st=max(weights);
      int end=sumOfDigits(weights); 
      int ans=end;
      while(st<=end)
      {
        int mid=st+(end-st)/2;
        if(isPossible(mid,weights,days))
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