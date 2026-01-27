/**
 * Given a number A, check if it is a magic number or not.

A number is said to be a magic number if the sum of its digits is calculated till a single digit recursively by adding the sum of the digits after every addition. If the single digit comes out to be 1, then the number is a magic number.

 */
module.exports = {
    //param A : integer
    //return an integer
    solve: function (A) {
        return this.checkMagic(A);
    },
    checkMagic(A) {
        let digits = A.toString().split('');
        let sum = 0;
        if (digits.length == 1) {
            if (Number(digits[0]) == 1) {
                return 1;
            }
            return 0;
        }
        for (let i = 0; i < digits.length; i++) {
            sum += Number(digits[i]);
        }
        return this.checkMagic(sum)
    }
};
