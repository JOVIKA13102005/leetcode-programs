class Solution {
    public int countNegatives(int[][] grid) {
       int m = grid.length;
        int n = grid[0].length;
        int count = 0;
        int rows = m-1, col = 0;
        while (rows >= 0 && col < n) {
            if (grid[rows][col] < 0) {
                count += n-col;
                rows--;
            } else {
                col++;
            }
        }
        return count;
 
    }
}