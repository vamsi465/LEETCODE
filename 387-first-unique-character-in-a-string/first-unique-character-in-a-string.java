class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[32];
        for(int i=0;i<s.length();i++)
        {
            int x=s.charAt(i)-'a';
            arr[x]++;
        }
        for(int i=0;i<s.length();i++)
        {
            int temp=s.charAt(i)-'a';
            if(arr[temp]==1)
            {
                return i;
            }
        }
        return -1;
    }
}