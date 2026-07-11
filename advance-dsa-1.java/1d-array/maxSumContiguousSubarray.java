/**
 * Problem Description

Given an array A of length N, your task is to find the maximum possible sum of any non-empty contiguous subarray.

In other words, among all possible subarrays of A, determine the one that yields the highest sum and return that sum.



Problem Constraints

1 <= N <= 106
-1000 <= A[i] <= 1000



Input Format

The first and the only argument contains an integer array, A.



Output Format

Return an integer representing the maximum possible sum of the contiguous subarray.



Example Input

Input 1:

 A = [1, 2, 3, 4, -10] 
Input 2:

 A = [-2, 1, -3, 4, -1, 2, 1, -5, 4] 


Example Output

Output 1:

 10 
Output 2:

 6 
 */
public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int maxSum = Integer.MIN_VALUE;
         int currentSum =0;
        for(int i=0;i<A.length;i++){
            currentSum= currentSum + A[i];
             maxSum = Math.max(maxSum, currentSum);
            if(currentSum<0){
                currentSum = 0;
            }
            // System.out.print(maxSum);
        }
        return maxSum;
    }
}
//use kadance algorithm to find the maximum sum of contiguous subarray.
// add the current sum to the current element and check if the current sum is greater than the max sum. If it is, update the max sum. If the current sum becomes negative, reset it to 0. Finally, return the max sum.
