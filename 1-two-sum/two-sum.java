class Solution {
    public int[] twoSum(int[] nums, int target) {
     int n=nums.length;
     int[] a=new int[2];
     for(int i=0;i<n-1;i++)
     {
        int j=n-1;
        while(i<j)
        {
        int req=nums[i]+nums[j];
         if(req==target)
         {
            a[0]=i;
            a[1]=j;
            return a;
         }
         j--;
        }
     } 
     return a;
    }
}