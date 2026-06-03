
public class Solution {
    public int countMinSquares(int A) {
        int[] dp = new int[A+1];
        Arrays.fill(dp, -1);
        return getMinSquares(A, dp);
    }

    public int getMinSquares(int A, int[] dp){
        int ans = Integer.MAX_VALUE;
        if(A == 0) return dp[A] = A;
        if(dp[A] != -1) return dp[A];
        for(int i=1;i *i <= A; i++){
            ans = Math.min(getMinSquares(A - (i*i), dp), ans);
        }
        ans = ans + 1;
        return dp[A] = ans;
    }
}
