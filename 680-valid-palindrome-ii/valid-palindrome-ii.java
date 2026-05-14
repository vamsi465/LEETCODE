class Solution {
    public boolean validPalindrome(String s) {
        int end=s.length()-1;
        int start=0;
        while(start<end)
        {
            if(s.charAt(start)==s.charAt(end))
            {
                start++;
                end--;
            }
            else{
                return isPalindrome(s,start+1,end)||isPalindrome(s,start,end-1);
            }
        }
        return true;
    }
    boolean isPalindrome(String s,int st,int end){
        while(st<end)
        {
            if(s.charAt(st++)!=s.charAt(end--))
            {
                return false;
            }
        }
        return true;
}
}