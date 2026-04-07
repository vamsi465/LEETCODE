class Solution {
    public int[] twoSum(int[] numbers, int target) {
       int st=0;
       int end=numbers.length-1;
       while(st<end)
       {
         int req=numbers[st]+numbers[end];
         if(target==req)
         {
            return new int[]{st+1,end+1};
         }
         else if(req>target)
         {
            end--;
         }
         else
         {
            st++;
         }
       }
       return new int[]{0,0};
    }
}