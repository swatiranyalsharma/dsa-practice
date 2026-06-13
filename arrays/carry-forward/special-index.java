public class Solution {
    public int solve(int[] A) {
        // Brute force approach is 
        // Create copy of array ,remove every element 
        // Find sum of odd indexed and even indexed in new array
        // compare and add to the answer
        // this approach will take n*N time complexity
        // first go to every index for every new array find the sum of even and odd
        // even if we use prefix sum, we have to create pf for each new array
        // As per constrains this approach will fail
        // Approach 2
        // for every element 
        // sum of even will be. -> sum of even on left + sum of odd on right
        // sum of odd will be -> sum of odd in left + sum of even in right
        // find these sum using prefix sum
        int[] oddIndexedPrefixSum = new int[A.length];
        int[] evenIndexedPrefixSum = new int[A.length];
        generateOddIndexPrefixSum(A, oddIndexedPrefixSum);
        generateEvenIndexPrefixSum(A, evenIndexedPrefixSum);
        int specialIndexCount =0;
        // [0,1,2,3,4,5,6] - indexes
        // [1,2,3,7,1,2,3] - array
        // [0,2,2,9,9,11,11] - odd prefix
        // [1,1,4,4,5,5,8] - even prefix
        for(int i=0; i< A.length ; i++){
            int even_indexed_sum = Integer.MIN_VALUE;
            int odd_indexed_sum = Integer.MIN_VALUE;
            if(i == 0){
                // even_indexed_sum = sum-odd[1 to n-1] ;
                even_indexed_sum = oddIndexedPrefixSum[A.length-1] - oddIndexedPrefixSum[0];
                odd_indexed_sum = evenIndexedPrefixSum[A.length-1] - evenIndexedPrefixSum[0];
            }else{
                // even_indexed_sum = sum_even[0 to i-1] + sum_odd [i+1 to n-1];
                even_indexed_sum = evenIndexedPrefixSum[i-1] + (oddIndexedPrefixSum[A.length-1] - oddIndexedPrefixSum[i]);
                // odd_indexed_sum = sum_odd[0 to i-1] + sum_even[i+1 to n-1];
                odd_indexed_sum = oddIndexedPrefixSum[i-1] + (evenIndexedPrefixSum[A.length -1] - evenIndexedPrefixSum[i]);
            }
            if(even_indexed_sum != Integer.MIN_VALUE && even_indexed_sum == odd_indexed_sum ){
              specialIndexCount = specialIndexCount + 1;      
            }

        }
        return specialIndexCount;


    }

    public void generateEvenIndexPrefixSum(int[] A, int[] evenIndexedPrefixSum){
        evenIndexedPrefixSum[0] = A[0];
        for(int i=1;i < A.length;i++){
            if(i % 2 ==0){
                evenIndexedPrefixSum[i] = evenIndexedPrefixSum[i-1] + A[i]; 
            }else{
                evenIndexedPrefixSum[i] = evenIndexedPrefixSum[i-1];
            }
        }
    }

     public void generateOddIndexPrefixSum(int[] A, int[] oddIndexedPrefixSum){
        oddIndexedPrefixSum[0] = 0;
        for(int i=1;i < A.length;i++){
            if(i % 2 !=0){
                oddIndexedPrefixSum[i] = oddIndexedPrefixSum[i-1] + A[i]; 
            }else{
                oddIndexedPrefixSum[i] = oddIndexedPrefixSum[i-1];
            }
        }
    }
}
