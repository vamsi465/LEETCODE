class Solution {
    public int longestConsecutive(int[] nums) {

        HashSet<Integer> hs = new HashSet<>();

        for(int ele : nums) {
            hs.add(ele);
        }

        int max = 0;

        for(int ele : hs) {

            // starting point
            if(!hs.contains(ele - 1)) {

                int count = 1;

                while(hs.contains(ele + 1)) {
                    ele++;
                    count++;
                }

                max = Math.max(max, count);
            }
        }

        return max;
    }
}