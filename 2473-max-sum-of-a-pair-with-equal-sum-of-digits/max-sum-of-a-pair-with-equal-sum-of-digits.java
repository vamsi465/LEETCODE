class Solution {
    int digitSum(int x)
    {
        int sum=0;
        while(x>0)
        {
            int digit=x%10;
            sum+=digit;
            x=x/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
      int max_sum=-1;
      HashMap<Integer,Integer>hm=new HashMap<>();
      for(int i=0;i<nums.length;i++)
      {
        int digitSum=digitSum(nums[i]);
        if(hm.containsKey(digitSum))
        {
            max_sum=Math.max(max_sum,hm.get(digitSum)+nums[i]);
            if(hm.get(digitSum)<nums[i])
            {
                hm.put(digitSum,nums[i]);
            }
        }
        else{
            hm.put(digitSum,nums[i]);
        }
      } 
      return max_sum; 
    }
}