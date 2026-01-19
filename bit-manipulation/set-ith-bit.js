/**Problem Description

You are given two integers A and B.
Set the A-th bit and B-th bit in 0, and return output in decimal Number System.

Note:
The bit positions are 0-indexed, which means that the least significant bit (LSB) has index 0.


Problem Constraints

0 <= A <= 30
0 <= B <= 30 */

module.exports = { 
 //param A : integer
 //param B : integer
 //return an integer
	solve : function(A, B){
        let num = 0;
        let ans = num | 1 << A;
        ans = ans | 1 << B;
        return ans
	}
};
