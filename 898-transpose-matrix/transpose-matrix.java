class Solution {
    public int[][] transpose(int[][] matrix) {
     int n = matrix.length;
        int m = matrix[0].length;
        int[][] ans = new int[m][n];
        for(int row=0;row<m;row++){
            for(int col=0;col<n;col++){
                ans[row][col]=matrix[col][row];
            }
        }
        return ans;
   
    }
}