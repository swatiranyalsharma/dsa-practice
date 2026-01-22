/**
 * You are given an integer A, print A to 1 using using recursion.

Note :- After printing all the numbers from A to 1, print a new line.
 */
module.exports = {
    //param A : integer
    solve: function (A) {
        this.print(A);
        process.stdout.write('\n');
    },
    print(A) {
        if (A == 0) return;
        process.stdout.write(`${A} `);
        this.print(A - 1);
    }
};
