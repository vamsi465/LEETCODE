class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum=Integer.MIN_VALUE;
        int c_s=0;
        for(int arr:nums)
        {
            if(c_s<0)
            {
              c_s=0;
            }
            c_s=c_s+arr;
           max_sum=Math.max(c_s,max_sum);
        }
        return max_sum; 
    }
}