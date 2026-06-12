public class Solution {
    public long[] rangeSum(int[] A, int[][] B) {
        long[] prefixSum = new long[A.length];
        generatePrefixSum(A, prefixSum);
        ArrayList<Long> ans = new ArrayList<>();
        for(int i=0;i < B.length;i++){
            int s = B[i][0];
            int e = B[i][1];
            long sum = 0;
            if(s == 0){
                sum = prefixSum[e];
            } else{
                sum = prefixSum[e] - prefixSum[s - 1];
            }
            ans.add(sum);
        }
        long[] ansArr = new long[ans.size()];
        for(int j=0;j<ans.size();j++){
            ansArr[j] = ans.get(j);
        }
        return ansArr;
    }
    public void generatePrefixSum(int[] A, long[] prefixSum){
        prefixSum[0] = A[0];
        for(int i=1;i < A.length;i++){
            prefixSum[i] = prefixSum[i-1] + (long)A[i];
        }
    }
}
