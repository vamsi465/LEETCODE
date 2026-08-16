class Solution {
    public int pivotIndex(int[] nums) {
        int ps[]=new int[nums.length];
        ps[0]=nums[0];
        int left_sum;
        int right_sum;
       for(int i=1;i<nums.length;i++) 
       {
        ps[i]=ps[i-1]+nums[i];
       }
       for(int i=0;i<nums.length;i++)
       {
         if(i==0)
         {
            left_sum=0;
         }
         else
         {
            left_sum=ps[i-1];
         }
         right_sum=ps[nums.length-1]-ps[i];
         if(left_sum==right_sum)
         {
            return i;
         }
       }
       return -1;
    }
}