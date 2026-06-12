public class Solution {
    public int solve(int[] A) {
        // sum of elements at lower indexes is equal to the 
        // sum of elements at higher indexes
        long[] prefixSum = new long[A.length];
        generatePrefixSum(A,prefixSum);
        int ans = -1;
        for(int i=0;i<A.length;i++){
            long sumLower = 0;
            long sumHigher = 0;
            if(i == 0 ){
                sumLower = 0;
                sumHigher = prefixSum[A.length -1] - prefixSum[0];
            }else{
                sumLower = prefixSum[i-1];
                sumHigher = prefixSum[A.length -1] - prefixSum[i];
            }
            if(sumHigher == sumLower){
                ans = i;
                break;
            }
        }
        return ans;
    }

    public void generatePrefixSum(int[] A, long[] prefixSum){
        prefixSum[0] = A[0];
        for(int i=1;i<A.length;i++){
            prefixSum[i] =  prefixSum[i-1] + A[i];
        }
    }
}
