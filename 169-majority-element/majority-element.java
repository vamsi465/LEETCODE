class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int count=0;
        int winner=nums[0];
        for(int i=0;i<n;i++)
        {
            if(winner==nums[i])
            {
                count++;
            }
            else if(winner!=nums[i])
            {
                count--;
            }
            if(count==0)
            {
                winner=nums[i+1];
            }
        }
        return winner;
    }
}