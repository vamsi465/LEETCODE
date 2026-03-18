class Solution {
    public void sortColors(int[] nums) {
        int cnt1=0;
        int cnt2=0;
        int cnt3=0;
        for(int i=0;i<nums.length;i++)
        {
          if(nums[i]==2)
          {
            cnt1++;
          } 
          else if(nums[i]==1)
          {
            cnt2++;
          } 
          else 
          {
            cnt3++;
          }
        }
        for(int j=0;j<cnt3;j++)
        {
            nums[j]=0;
        }
        for(int j=cnt3;j<(cnt3+cnt2);j++)
        {
            nums[j]=1;
        }
        for(int j=(cnt3+cnt2);j<nums.length;j++)
        {
            nums[j]=2;
        }
    }
}