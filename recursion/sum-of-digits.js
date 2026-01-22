/**
 * Given a number A, we need to find the sum of its digits using recursion.
 */

module.exports = {
    //param A : integer
    //return an integer
    solve: function (A) {
        let numArray = A.toString().split('');
        let sum = this.findSum(0, numArray);
        return sum;
    },
    findSum: function(i, numArray) {
        if (i == numArray.length) {
            return 0;
        }
        return Number(numArray[i]) + this.findSum(i + 1, numArray);
    }
};
