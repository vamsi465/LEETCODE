class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>al=new ArrayList<>();
        int candidate1=0;
        int candidate2=0;
        int cnt1=0;
        int cnt2=0;
        for(int ele:nums)
        {
            if(ele==candidate1){
              cnt1++;
            }
            else if(ele==candidate2)
            {
                cnt2++;
            }
           else if(cnt1==0&&ele!=candidate2)
            {
                candidate1=ele;
                cnt1=1;
            }
            else if(cnt2==0&&ele!=candidate1)
            {
                candidate2=ele;
                cnt2=1;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
             cnt1 = 0;
             cnt2 = 0;

        for(int num : nums){
            if(num == candidate1) cnt1++;
            else if(num == candidate2) cnt2++;
                        }
            if(cnt1 > nums.length/3)
             al.add(candidate1);

            if(cnt2 > nums.length/3)
            al.add(candidate2);
           return al;   
    }
}