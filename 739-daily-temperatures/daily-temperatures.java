class Solution {
    public int[] dailyTemperatures(int[]temperatures) {
       int ans[]=new int[temperatures.length];
       Stack<Integer>st=new Stack<>();
       int j=temperatures.length-1;
       for(int i=temperatures.length-1;i>=0;i--)
       {
        while(!st.isEmpty()&&temperatures[i]>=temperatures[st.peek()])
        {
            st.pop();
        }
        if(!st.isEmpty())
        {
            ans[j--]=Math.abs(i-st.peek());
            st.push(i);
        }
        else{
             st.push(i);
             ans[j--]=0;
        }
       } 
       return ans;
    }
}