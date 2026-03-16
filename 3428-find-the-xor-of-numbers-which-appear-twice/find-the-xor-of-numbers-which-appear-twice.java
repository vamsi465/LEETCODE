class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int arr[]=new int[51];
        int res=0;
        for(int e:nums)
        {
          int idx=e;
          if(arr[idx]<0)
          {
             res=res^idx;
          }
          arr[idx]=-e;  
        } 
        return res;   
    }
}