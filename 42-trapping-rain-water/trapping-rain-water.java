class Solution {
    public int trap(int[] height) {
     int n=height.length;
     int right=n-1;
     int left=0;
     int left_max=0;
     int right_max=0;
     int max_water=0;
     while(left<right)
     {
        if(height[left]<height[right])
        {
            left_max=Math.max(left_max,height[left]);
            max_water+=(left_max-height[left]);
            left++;
        }
        else{
            right_max=Math.max(right_max,height[right]);
            max_water+=(right_max-height[right]);
            right--;
        }
     }
     return max_water;
    }
}