class Solution {
    public int numTrees(int n) {
        //nth unique binary search trees -> nth catalan number
        // cn = c(n-1)c0 + c(n-2)c1 + .....+ c0C(n-1)
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<dp.length;i++){
            for(int j=0;j<i;j++){
                dp[i] += dp[j] * dp[i-j-1];
            }
            
        }
        return dp[n];
    }

}