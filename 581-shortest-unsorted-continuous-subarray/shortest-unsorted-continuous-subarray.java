class Solution {
    public int findUnsortedSubarray(int[] nums) {
      int n=nums.length;
      int first=0,second=nums.length-1;
      int p1,p2;
      boolean flag1=false,flag2=false;
      for(int i=first;i<n-1;i++)
      {

          if(nums[i]>nums[i+1])
          {
            first=i;
            flag1=true;
            break;
          }  
        }
      for(int i=n-1;i>0;i--)
      {
          if(nums[i]<nums[i-1])
          {
            second=i;
            flag1=true;
            break;
          }  
        }
       int min = Integer.MAX_VALUE , max = Integer.MIN_VALUE;
        for(int i=first; i <= second;i++){
            min = Math.min(min , nums[i]);
            max = Math.max(max , nums[i]);
        }
        while(first > 0 && nums[first-1] > min) first--;
        while(second < nums.length-1 && nums[second+1] < max) second++;

        if(!flag1 && !flag2) return 0;
        return second-first+1;
            
    }
}