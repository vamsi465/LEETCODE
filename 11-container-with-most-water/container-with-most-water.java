class Solution {
    public int maxArea(int[] height) {
      int area=0;
      int l=0;
      int r=height.length-1;
      while(l<r)
      {
        int hei=Math.min(height[l],height[r]);
        int width=r-l;
        int max=hei*width;
        area=Math.max(area,max);
        if(height[l]>height[r])
        {
            r--;
        }
        else{
            l++;
        }
      }
      return area;  
    }
}