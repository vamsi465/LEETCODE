class Solution {
    public int[] singleNumber(int[] nums) {
        int res[]=new int[2];
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            int count=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    count++;
                }
            }
            if(count==1)
            {
                res[k++]=nums[i];
            }

    }
    return res;
    }
}