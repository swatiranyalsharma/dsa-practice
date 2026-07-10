/**
 * 2. Noble Integer
Save for later
Problem Description

Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p in the array equals p.



Problem Constraints

1 <= |A| <= 2*105
-108 <= A[i] <= 108


Input Format

First and only argument is an integer array A.



Output Format

Return 1 if any such integer p is present else, return -1.



Example Input

Input 1:

 A = [3, 2, 1, 3]
Input 2:

 A = [1, 1, 3, 3]


Example Output

Output 1:

 1
Output 2:

 -1
 */
public class Solution {
    public int solve(int[] A) {
        // int[] A = new int[4]{3, 2, 1, 3};
        Arrays.sort(A);
        int s=0;
        int e = A.length-1;
        while(s<e){
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
        // System.out.print(A);
        if(A[0] == 0) return 1;
        for(int i=1;i<A.length;i++){
            int count = 0;
            if(A[i-1] == A[i]){
                int k = i;
                while(k>0 && A[k] == A[k-1]){
                  k--;
                }
                count = s+1;
            }else{
                count = i;
            }
            if(count == A[i]){
                return 1;
            }
        }
        return -1;

    }
}
// -4,-2, 0, -1, -6 ]
// -6,-4,-2, -1, 0
//    0.  1. 2  3.  4
// 0, -1, -2, -4, -6
