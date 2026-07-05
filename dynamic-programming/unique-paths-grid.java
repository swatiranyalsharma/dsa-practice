/*Given a grid of size n * m, lets assume you are starting at (1,1) and your goal is to reach (n, m). 
At any instance, if you are on (x, y), you can either go to (x, y + 1) or (x + 1, y).

Now consider if some obstacles are added to the grids. 
Return the total number unique paths from (1, 1) to (n, m).

Note: 
1. An obstacle is marked as 1 and empty space is marked 0 respectively in the grid.
2. Given Source Point and Destination points are 1-based index. */

public class Solution {
    public int uniquePathsWithObstacles(int[][] A) {
        if(A.length == 1 && A[0].length == 1){
            if(A[0][0] == 0){
                return 1;
            }
        }
        int[][] dp = new int[A.length][A[0].length];
        for(int[] row : dp){
            Arrays.fill(row, -1);
        }
        return findPaths(0, 0, A.length -1, A[0].length-1, A, dp);
    }

    public int findPaths(int sRow, int sCol, int dRow, int dCol, int[][] A, int[][] dp){
        if(sRow >= A.length) return 0;
        if(sCol >= A[0].length) return  0;
        if(A[sRow][sCol] == 1) return  dp[sRow][sCol] =0;
        if(sRow == dRow && sCol == dCol) return  dp[sRow][sCol] =1;
        if(dp[sRow][sCol] !=-1) return dp[sRow][sCol];
        return dp[sRow][sCol] = (findPaths(sRow+1, sCol, dRow, dCol, A, dp) + findPaths(sRow, sCol +1, dRow,dCol, A, dp));
    }
}
