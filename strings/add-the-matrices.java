/**Problem Description

You are given two matrices A & B of same size, you have to return another matrix which is the sum of A and B.
Note: Matrices are of same size means the number of rows and number of columns of both matrices are equal.

The Following will give you an idea of matrix addition: */
public class Solution {
    public int[][] solve(int[][] A, int[][] B) {
        int[][] res = new int[A.length][A[0].length];
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++){
                res[i][j] = A[i][j] + B[i][j];
            }
        }
        return res;
    }
}
