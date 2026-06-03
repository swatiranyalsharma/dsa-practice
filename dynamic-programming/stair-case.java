public class Solution {
    int mod = 1000000007;
    public int climbStairs(int A) {
        int[] dp = new int[A+1];
        Arrays.fill(dp, -1);
        return ways(A, dp) % mod;
    }

    public int ways(int A, int[] dp){
        if(A <=2) return dp[A] = A;
        if(dp[A] != -1) return dp[A];
        int ans =  ways(A-1, dp) % mod + ways(A-2, dp) % mod;
        return dp[A] = ans;
    }
}
