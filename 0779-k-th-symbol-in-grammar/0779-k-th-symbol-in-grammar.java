class Solution {
    public int kthGrammar(int n, int k) {
        return solve(n,k);
    }

    public int solve(int n, int k){
        if(n == 1) return 0;
        int strLength = n-1;
        long mid = (long)Math.pow(2, strLength)/2;
        if(k<= mid){
            return solve(n-1, k);
        }else{
            int newK = k - (int)mid;
            int res = solve(n-1, newK);
            res = res ^ 1;
            return res;
        }
        // return res;
    }
}