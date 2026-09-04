class Solution {
    int numberOfDigits(int num)
    {
        int cnt=0;
        while(num>0)
        {
            cnt=1+cnt;
            num=num/10;
        }
        return cnt;
    }
    public int findNumbers(int[] nums) {
        int ans=0;
       for(int i=0;i<nums.length;i++)
       {
        int totalDigit=numberOfDigits(nums[i]);
        if(totalDigit%2==0)
        {
            ans++;
        }
       } 
       return ans;
    }
}