class Solution {
    public int[][] merge(int[][] intervals) {
     Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
      int[] start=intervals[0];
      List<int []>list=new ArrayList<>();
      for(int i=1;i<intervals.length;i++)
      {
        if(start[1]>=intervals[i][0])
        {
            start[0]=Math.min(start[0],intervals[i][0]);
            start[1]=Math.max(intervals[i][1],start[1]);
        }
        else{
            list.add(start);
            start=intervals[i];
        }
      }
      list.add(start);  
      return list.toArray(new int[list.size()][]);
    }
}