public class Solution {
    public int[] sumOfEvenIndexedElements(int[] A, int[][] B) {
        generatePrefixArrayForEvenIndexes(A);
        int[] ans = new int[B.length];
        for(int i=0;i<B.length; i++){
            int l = B[i][0];
            int r = B[i][1];
            if(l == 0){
                ans[i] = A[r];
            }else{
                ans[i] = A[r] - A[l-1];
            }
        }
        return ans;
    }

    public void generatePrefixArrayForEvenIndexes(int[] A){
        for(int i=1; i<A.length; i++){
            if(i % 2 == 0){
                A[i] = A[i-1] +A[i];
            }else{
                A[i] = A[i -1];
            }
        }
    }
}
