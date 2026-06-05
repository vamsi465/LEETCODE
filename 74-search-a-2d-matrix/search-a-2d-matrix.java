class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
      for(int i=0;i<matrix.length;i++)
      { 
        int st=0;
        int end=matrix[i].length-1;
         while(st<=end)
         {
            int mid=st+(end-st)/2;
            if(matrix[i][end]>=target)
            {
                if(matrix[i][mid]==target)
               {
                return true;
               }
            if(matrix[i][mid]>target)
            {
                end=mid-1;
            }
            else if(matrix[i][mid]<target)
            {
                st=mid+1;
            }
            
           }
           else
           {
             break;
           }
        }
      }  
      return false;
    }
}