class Solution {
    void reverse(int[] arr,int st,int end)
    {
        while(st<end)
        {
            int temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
    }
    void swap(int[][] arr,int i,int j)
    {
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
    }
    public void rotate(int[][] matrix) {
       int n=matrix.length;
       for(int i=0;i<=n-2;i++)
       {
        for(int j=i+1;j<=n-1;j++)
        {
            swap(matrix,i,j);
        }
       } 
       for(int i=0;i<n;i++)
       {
         reverse(matrix[i],0,matrix.length-1);
       }
    }
}