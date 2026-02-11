class Solution {
       void swap(int n[],int s,int e)
       {
          while(s<e)
          {
            int temp=n[s];
            n[s]=n[e];
            n[e]=temp;
            s++;
            e--;
          }
       }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        swap(nums,0,n-1);
        swap(nums,0,k-1);
        swap(nums,k,n-1);
    }
}