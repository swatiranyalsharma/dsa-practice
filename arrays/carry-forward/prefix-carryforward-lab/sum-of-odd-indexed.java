public class Solution {
    public int[] sumOfOddIndexedElements(int[] A, int[][] B) {
        generateOddIndexedPrefixSum(A);
        int[] ans = new int[B.length];
        for(int i=0;i < B.length; i++){
            int s = B[i][0];
            int e = B[i][1];
            int sum = 0;
            if(s == 0){
                sum = A[e];
            }else{
                sum = A[e] - A[s -1];
            }
            ans[i] = sum;
        }
        return ans;
    }

    public void generateOddIndexedPrefixSum(int[] A){
        A[0] = 0;
        for(int i=1; i<A.length; i++){
            if(i%2 != 0){
                A[i] = A[i-1] + A[i];
            }else{
                A[i] = A[i -1];
            }
        }
    }
}
