/*You are given two integers A and B.
If B-th bit in A is set, make it unset.
If B-th bit in A is unset, leave as it is.
Return the updated A value.

Note:
The bit position is 0-indexed, which means that the least significant bit (LSB) has index 0.
Problem Constraints

1 <= A <= 109
0 <= B <= 30
*/

module.exports = {
    //param A : integer
    //param B : integer
    //return an integer
    solve: function (A, B) {
        let ans = A;
        if (this.checkBthBit(A, B)) {
            ans = A ^ (1 << B);
        }
        return ans;
    },
    checkBthBit(A, B) {
        return (A & (1 << B)) !== 0;

    }
};
