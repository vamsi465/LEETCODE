import java.util.Arrays;
class Solution {
    boolean isPossible(int mid,int[] arr,int m)
    {
        int lastPosition=arr[0];
        int cnt=1;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]-lastPosition>=mid)
            {
                lastPosition=arr[i];
                cnt++;
            }
        }
        return cnt>=m;
    }
    int max(int[] arr)
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
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int st=1;
        int end=max(position)-st;
        int ans=1;
        while(st<=end)
        {
            int mid=st+(end-st)/2;
            if(isPossible(mid,position,m))
            {
                ans=mid;
                st=mid+1;
            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
}