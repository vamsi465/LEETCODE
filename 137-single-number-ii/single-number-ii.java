class Solution {
    public int singleNumber(int[] nums) {
        int arr[]=new int[32];
        for(int i=0;i<nums.length;i++)
        {
            int x=nums[i];
            for(int j=0;j<32;j++)
            {
                arr[j]=arr[j]+(x&1);
               x=x>>1;
            }
        }
        int sum=0;
        int p=1;
        for(int i=0;i<32;i++)
        {
            arr[i]=arr[i]%3;
            sum+=arr[i]*p;
            p=p<<1;
        }
        return sum;
    }
}