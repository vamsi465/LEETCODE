import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->{
            return a[0]-b[0];
        });
        List<int[]> al=new ArrayList<>();
        int first[]=intervals[0];
        for(int i=1;i<intervals.length;i++)
        {
            if(first[1]>=intervals[i][0])
            {
                first[1]=Math.max(first[1],intervals[i][1]);
            }
            else{
                al.add(first);
                first=intervals[i];
            }
        }
           al.add(first);
          int[][] array = al.toArray(new int[al.size()][]);
          return array;
    }
}