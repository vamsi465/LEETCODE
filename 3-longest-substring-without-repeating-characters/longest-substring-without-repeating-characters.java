
class Solution {
    public int lengthOfLongestSubstring(String s) {
      int count=0;
      int max_cnt=0;
      int left=0;
      Set<Character> set=new HashSet<>();
      for(int r=0;r<s.length();r++) {
        if(set.contains(s.charAt(r)))
        {
            left++;
            count=0;
            set=new HashSet<>();
            r=left;
        }
        set.add(s.charAt(r));
        count++;
        if(count>max_cnt)
        {
            max_cnt=count;
        }
      }
      return max_cnt;
    }
}