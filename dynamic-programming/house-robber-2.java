/**
 * Given a 2 x N grid of integers, A, your task is to choose numbers from the grid such that sum of these numbers is maximized. 
However, you cannot choose two numbers that are adjacent horizontally, vertically, or diagonally. 

Return the maximum possible sum.

Note: You are allowed to choose more than 2 numbers from the grid.
 */
public class Solution {
    public int adjacent(int[][] A) {
        int[] arr = new int[A[0].length];
        for(int i=0;i<A[0].length;i++){
            int max = Integer.MIN_VALUE;
            for(int j=0;j<A.length;j++){
                max = Math.max(max, A[j][i]);
            }
            arr[i] = max;
        }
        int[] dp =new int[arr.length];
        Arrays.fill(dp, -1);
        return maximize(arr.length -1, arr, dp);

    }
    public int maximize(int idx,int[] arr, int[] dp){
        if(idx < 0) return 0;
        if(idx == 0) return dp[0]=arr[0];
        if(dp[idx] !=-1) return dp[idx];
        int op1 = arr[idx] + maximize(idx - 2, arr, dp); // choose
        int op2 = maximize(idx-1, arr, dp); // leave

        return dp[idx] = Math.max(op1, op2);
    }
}
