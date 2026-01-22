/**
 * Problem Description

You are given an integer A, print 1 to A using using recursion.

Note :- After printing all the numbers from 1 to A, print a new line.
 */

module.exports = {
    //param A : integer
    solve: function (A) {
        this.print(A);
        process.stdout.write('\n');
    },
    print: function(A) {
        if (A < 1) {
            return;
        }
        this.print(A - 1);
        process.stdout.write(`${A}`);
         process.stdout.write(' ');
    }
};
