class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
      int n=nums.length;
      Arrays.sort(nums);
      for(int i=0;i<n-2;i++)
      {
        int l=i+1;
        int r=n-1;
        if(i>0&&nums[i]==nums[i-1])
        {
            continue;
        }
      while(l<r)
      {
        int sum=nums[l]+nums[r]+nums[i];
        if(sum==0)
        {
             res.add(Arrays.asList(nums[i],nums[l],nums[r]));
             while(l<r && nums[l]==nums[l+1])l++;
              while(l<r && nums[r]==nums[r-1])r--;
              r--;
              l++;
        }
        else if(sum>0)
        {
            r--;
        }
        else
        {
            l++;
        }
      }
    } 
    return res;
  }
}