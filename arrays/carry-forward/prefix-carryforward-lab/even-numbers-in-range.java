public class Solution {
    public int[] solve(int[] A, int[][] B) {
        // Brute force approach will be go to every query
        // get range values
        // loop over all the elemnts in athe range
        // ask count of even numbers and add to answer
        
        // for 1 iteration time - worst - n (in case range is 0 to n-1)
        // for n iterations time comp - n * n
        
        //optimized approach - create prefix sum array for occurence of even numbers
        // use it in queries
        // geting data from index of array is o(1)
        // n -> to generate prefix sum array
        generatePrefixSumArray(A);
        int[] ans = new int[B.length];
        for(int i =0;i <B.length; i++){
            int s = B[i][0];
            int e = B[i][1];
            int count = 0;
            if(s == 0){
                count = A[e];
            }else{
                count = A[e] - A[s - 1];
            }
            ans[i] = count;
        }
        return ans;

    }

    public void generatePrefixSumArray(int[] A){
        if(A[0] % 2 != 0){
            A[0] = 0;
        }else{
            A[0] = 1;
        }
        for(int i=1; i <A.length;i++){
            if(A[i] % 2 == 0){
                A[i] = A[i-1] + 1;
            }else{
                A[i] = A[i - 1];
            }
        }
    }
}
