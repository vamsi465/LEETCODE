import java.util.*;
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
       int ans[]=new int[10001];
       int k=nums1.length-1;
       Stack<Integer> st=new Stack<>();
       for(int i=nums2.length-1;i>=0;i--)
       {
        while(!st.isEmpty()&&st.peek()<=nums2[i])
        {
            st.pop();
        }
        if(st.isEmpty())
        {
           ans[nums2[i]]=-1; 
        }
        else{
           ans[nums2[i]]=st.peek();
        }
         st.push(nums2[i]);
       }
       for(int i=0;i<nums1.length;i++)
       {
        nums1[i]=ans[nums1[i]];
       }
       return nums1;
    }
}