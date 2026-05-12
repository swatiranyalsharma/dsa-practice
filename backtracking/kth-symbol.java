/** 
 * On the first row, we write a 0. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.

Given row number A and index B, return the Bth indexed symbol in row A. (The values of B are 0-indexed.).
Input Format

First argument is an integer A.

Second argument is an integer B.



Output Format

Return an integer denoting the Bth indexed symbol in row A.



 */

public class Solution {
    public int solve(int A, int B) {
        return generate(A, B);
    }

    public int generate(int A, int B){
        if(A == 1) return 0;
        if(B %2 == 0){
            return generate(A-1, B/2);
        }else {
             return generate(A-1, B/2) ^ 1;
        }
    }
}
