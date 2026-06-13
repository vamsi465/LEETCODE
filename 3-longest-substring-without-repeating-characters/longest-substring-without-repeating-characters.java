
class Solution {
    public int lengthOfLongestSubstring(String s) {
      int count=0;
      int max_cnt=0;
      int left=0;
      Set<Character> set=new HashSet<>();
      for(int r=0;r<s.length();r++) {
        while(set.contains(s.charAt(r)))
        {
            set.remove(s.charAt(left));
             left++;
        }
        set.add(s.charAt(r));
        max_cnt=Math.max(max_cnt,r-left+1);
      }
      return max_cnt;
    }
}