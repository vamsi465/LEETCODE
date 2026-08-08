class Solution {
    boolean isPossible(int mid,int[] arr,int m,int k)
    {
       int cnt=0;
       int bouquests=0;
       for(int i=0;i<arr.length;i++)
       {
        if(arr[i]<=mid)
        {
            cnt++;
            if(cnt==k)
            {
                bouquests++;
                cnt=0;
            }
        } 
        else{
            cnt=0;
        }
       } 
       if(bouquests>=m)
       {
        return true;
       }
       return false;
    }
    int minDay(int[] arr)
    {
        int min=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }
    int maxDay(int[] arr)
    {
        int max=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
            }
        }
        return max;
    }
    public int minDays(int[] bloomDay, int m, int k) {
       int n=bloomDay.length;
       int ans=-1;
       if(m*k>n)
       {
        return -1;
       }
       int st=minDay(bloomDay);
       int end=maxDay(bloomDay);
       while(st<=end)
       {
        int mid=st+(end-st)/2;
        if(isPossible(mid,bloomDay,m,k))
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