class Solution {
    void swap(int nums[],int a,int b)
    {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public void sortColors(int[] nums) {
        int end=nums.length-1;
        int start=0;
        int mid=0;
        while(mid<=end)
        {
            if(nums[mid]==2)
            {
                swap(nums,mid,end);
                end--;
            }
            else if(nums[mid]==1)
            {
                mid++; 
            }
            else if(nums[mid]==0)
            {
                swap(nums,mid,start);
                start++;
                mid++;
            }

        }
    }
}