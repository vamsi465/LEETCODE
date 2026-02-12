class Solution {
    public int maxSubArray(int[] nums) {
        int lar=Integer.MIN_VALUE;
        int Csum=0;
        for(int i=0;i<nums.length;i++)
        { 
            if(Csum<0)
            {
                Csum=0;
            }
            Csum+=nums[i];
            lar=Math.max(Csum,lar);
        }
    return lar; 
    }
}