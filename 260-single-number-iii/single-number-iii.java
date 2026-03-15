class Solution {
    public int[] singleNumber(int[] nums) {
       HashMap<Integer,Integer>hm=new HashMap<>();
       int res[]=new int[2];
       int k=0;
       for(int ele:nums)
       {
         if(hm.containsKey(ele))
         {
            hm.put(ele,hm.get(ele)+1);
         }
         else
         {
            hm.put(ele,1);
         }
       } 
       for(int e:hm.keySet())
       {
          if(hm.get(e)==1)
          {
             res[k++]=e;
          }
       }
       return res;
    }
}